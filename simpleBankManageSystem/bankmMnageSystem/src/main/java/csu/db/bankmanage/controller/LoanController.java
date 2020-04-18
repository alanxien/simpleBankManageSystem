package csu.db.bankmanage.controller;

import csu.db.bankmanage.domain.Card;
import csu.db.bankmanage.domain.Loan;
import csu.db.bankmanage.domain.Subscribe;
import csu.db.bankmanage.service.CardService;
import csu.db.bankmanage.service.MessageService;
import csu.db.bankmanage.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;

@Controller
public class LoanController {
    @Autowired
    private CardService cardService;

    @Autowired
    private MoneyService moneyService;

    @Autowired
    private MessageService messageService;

    // 查看贷款
    @RequestMapping("/viewLoan")
    public String viewLoan(HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        ArrayList<Card> cardList;
        cardList = cardService.findCardsByUserNum(userNum);
        // System.out.println(cardList);
        model.addAttribute("cardList", cardList);
//        session.setAttribute("cardList", cardList);

        ArrayList<Loan> loanRecord;
        loanRecord = cardService.findLoanRecordByUserNum(userNum);
        model.addAttribute("loanRecord", loanRecord);

        return "loan/viewLoan";
    }

    // 借贷
    @GetMapping("dealLoan")
    public String getDealLoan(HttpSession session, Model model){

        String userNum = session.getAttribute("userNum").toString();
        ArrayList<Card> cardList;
        cardList = cardService.findCardsByUserNum(userNum);
        // System.out.println(cardList);
        model.addAttribute("cardList", cardList);
//        session.setAttribute("cardList", cardList);

        return "loan/dealLoan";
    }

    @PostMapping("dealLoan")
    public String dealLoan(HttpServletRequest request, HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        String selectCard = request.getParameter("dealCard");
        String depositMoney = request.getParameter("dealMoney");

        int selectCardId = Integer.parseInt(selectCard);
        double money = Double.parseDouble(depositMoney);

        Card card = cardService.getCardByCardId(selectCardId);

        if(card.getBalance() >= money){
            Date time = new java.sql.Date(new java.util.Date().getTime());
            moneyService.withdrawMoney(selectCardId, time, money);
            Subscribe withdrawSubscribe = messageService.getServiceByUserNum(userNum, "withdraw");
            if(withdrawSubscribe != null){
                messageService.addMessage(userNum, "取款", 0, "卡号：" + selectCard + "新增取款 " + money, time);
            }
            model.addAttribute("info", "当前卡 " + selectCard + " 余额充足，已直接取款！");
        }{
            Date time = new java.sql.Date(new java.util.Date().getTime());
            moneyService.dealLoan(selectCardId, time, money);
            Subscribe loanSubscribe = messageService.getServiceByUserNum(userNum, "loan");
            if(loanSubscribe != null){
                messageService.addMessage(userNum, "贷款", 0, "卡号：" + selectCard + "新增贷款 " + money, time);
            }
            model.addAttribute("info", "卡号：" + selectCard + " 借款成功！");
        }

        ArrayList<Card> cardList;
        cardList = cardService.findCardsByUserNum(userNum);
        // System.out.println(cardList);
        model.addAttribute("cardList", cardList);
//        session.setAttribute("cardList", cardList);

        return "loan/dealLoan";
    }

    // 还贷
    @GetMapping("repayLoan")
    public String getRepayLoan(HttpSession session, Model model){

        String userNum = session.getAttribute("userNum").toString();
        ArrayList<Card> cardList;
        cardList = cardService.findCardsByUserNum(userNum);
        // System.out.println(cardList);
        model.addAttribute("cardList", cardList);
//        session.setAttribute("cardList", cardList);

        return "loan/repayLoan";
    }

    @PostMapping("repayLoan")
    public String repayLoan(HttpServletRequest request, HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        String selectCard = request.getParameter("repayCard");
        String depositMoney = request.getParameter("repayMoney");
        int selectCardId = Integer.parseInt(selectCard);
        double money = Double.parseDouble(depositMoney);
        Date time = new java.sql.Date(new java.util.Date().getTime());

        Card card = cardService.getCardByCardId(selectCardId);
        double balance = card.getBalance();
        System.out.println(balance);
        if(balance >= 0) {
            // 无须还款
            moneyService.depositMoney(selectCardId, time, money);
            Subscribe depositSubscribe = messageService.getServiceByUserNum(userNum, "deposit");
            if(depositSubscribe != null){
                messageService.addMessage(userNum, "存款", 0, "卡号：" + selectCard + "新增存款 " + money, time);
            }
            model.addAttribute("info", "卡号：" + selectCard + " 没有贷款，存款成功！");
        }else{
            moneyService.repayLoan(selectCardId, time, money);
            Subscribe repayLoanSubscribe = messageService.getServiceByUserNum(userNum, "repayLoan");
            if(repayLoanSubscribe != null){
                messageService.addMessage(userNum, "还款", 0, "卡号：" + selectCard + "新增还款 " + money, time);
            }
            if(Math.abs(balance) < money) {
                // 还款有余
                model.addAttribute("info", "卡号：" + selectCard + " 已还款，还款余额已存款！");
            }else{
                model.addAttribute("info", "卡号：" + selectCard + " 已还款 " + money + " 元，剩余贷款：" + Math.abs(balance + money) + " 元");
            }
        }

        ArrayList<Card> cardList;
        cardList = cardService.findCardsByUserNum(userNum);
        // System.out.println(cardList);
        model.addAttribute("cardList", cardList);
//        session.setAttribute("cardList", cardList);

        return "loan/repayLoan";
    }
}
