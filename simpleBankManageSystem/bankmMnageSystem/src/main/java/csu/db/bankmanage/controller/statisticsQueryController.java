package csu.db.bankmanage.controller;

import csu.db.bankmanage.domain.*;
import csu.db.bankmanage.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class statisticsQueryController {
    @Autowired
    private CardService cardService;

    // 展示所有数据
    @RequestMapping("showData")
    public String showData(HttpServletRequest request, HttpSession session, Model model){
        String userNum = session.getAttribute("userNum").toString();
        ArrayList<Deposit> depositArrayList;
        depositArrayList = cardService.findDepositRecordByUserNum(userNum);
        model.addAttribute("depositArrayList", depositArrayList);

        ArrayList<Withdraw> withdrawArrayList;
        withdrawArrayList = cardService.findWithdrawRecordByUserNum(userNum);
        model.addAttribute("withdrawArrayList", withdrawArrayList);

        ArrayList<Loan> loanArrayList;
        loanArrayList = cardService.findLoanRecordByUserNum(userNum);
        model.addAttribute("loanArrayList", loanArrayList);

        ArrayList<RepayLoan> repayLoanArrayList;
        repayLoanArrayList = cardService.findRepayLoanRecordByUserNum(userNum);
        model.addAttribute("repayLoanArrayList", repayLoanArrayList);

        return "statisticsQuery/showData";
    }
}
