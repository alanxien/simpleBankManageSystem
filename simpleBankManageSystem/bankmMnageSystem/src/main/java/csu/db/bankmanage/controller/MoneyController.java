package csu.db.bankmanage.controller;

import csu.db.bankmanage.domain.Card;
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

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;

@Controller
public class MoneyController {
    @Autowired
    private CardService cardService;

    @Autowired
    private MoneyService moneyService;

    @Autowired
    private MessageService messageService;

    // 存款
    @GetMapping("/deposit")
    public String getDeposit(HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        ArrayList<Card> cardList;
        cardList = cardService.findCardsByUserNum(userNum);
        // System.out.println(cardList);
        model.addAttribute("cardList", cardList);
//        session.setAttribute("cardList", cardList);
        return "money/deposit";
    }

    @PostMapping("/deposit")
    public String deposit(HttpServletRequest request, HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        String selectCard = request.getParameter("depositCard");
        String depositMoney = request.getParameter("depositMoney");
        int selectCardId = Integer.parseInt(selectCard);
        double money = Double.parseDouble(depositMoney);
        Date time = new java.sql.Date(new java.util.Date().getTime());
        moneyService.depositMoney(selectCardId, time, money);

        Subscribe depositSubscribe = messageService.getServiceByUserNum(userNum, "deposit");
        if(depositSubscribe != null){
            messageService.addMessage(userNum, "存款", 0, "卡号：" + selectCard + "新增存款 " + money, time);
        }
        model.addAttribute("info", "卡号：" + selectCard + " 存款成功！");

        ArrayList<Card> cardList;
        cardList = cardService.findCardsByUserNum(userNum);
        // System.out.println(cardList);
        model.addAttribute("cardList", cardList);
//        session.setAttribute("cardList", cardList);
        return "money/deposit";

//        return "redirect:/deposit";
    }

    // 取款
    @GetMapping("/withdraw")
    public String getWithdraw(HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        ArrayList<Card> cardList;
        cardList = cardService.findCardsByUserNum(userNum);
        // System.out.println(cardList);
        model.addAttribute("cardList", cardList);
//        session.setAttribute("cardList", cardList);
        return "money/withdraw";
    }

    @PostMapping("/withdraw")
    public String withdraw(HttpServletRequest request, HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        String selectCard = request.getParameter("withdrawCard");
        String depositMoney = request.getParameter("withdrawMoney");
        int selectCardId = Integer.parseInt(selectCard);
        double money = Double.parseDouble(depositMoney);

        Card card = cardService.getCardByCardId(selectCardId);

        if(card.getBalance() >= money) {
            Date time = new java.sql.Date(new java.util.Date().getTime());
            moneyService.withdrawMoney(selectCardId, time, money);
            Subscribe withdrawSubscribe = messageService.getServiceByUserNum(userNum, "withdraw");
            if(withdrawSubscribe != null){
                messageService.addMessage(userNum, "取款", 0, "卡号：" + selectCard + "新增取款 " + money, time);
            }
            model.addAttribute("info", "卡号：" + selectCard + " 取款成功！");
        }else {
            model.addAttribute("info", "该卡 " + selectCard + " 余额不足！");
        }

        ArrayList<Card> cardList;
        cardList = cardService.findCardsByUserNum(userNum);
        // System.out.println(cardList);
        model.addAttribute("cardList", cardList);
//        session.setAttribute("cardList", cardList);
        return "money/deposit";

//        return "redirect:/withdraw";
    }
}
