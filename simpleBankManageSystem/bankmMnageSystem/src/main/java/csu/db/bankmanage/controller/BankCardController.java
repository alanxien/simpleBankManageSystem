package csu.db.bankmanage.controller;

import csu.db.bankmanage.domain.Card;
import csu.db.bankmanage.service.CardService;
import csu.db.bankmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class BankCardController {

    @Autowired
    private UserService userService;

    @Autowired
    private CardService cardService;

    @RequestMapping("/myCard")
    public String myCard(HttpSession session){
        String userNum = session.getAttribute("userNum").toString();
        ArrayList<Card> cardList;
        cardList = cardService.findCardsByUserNum(userNum);
//        System.out.println(cardList);
        session.setAttribute("cardList", cardList);
        return "bankCard/myCards";
    }

    @RequestMapping("/cancelCard")
    public String cancelCard(double cardId){
        // System.out.println(cardId);
        Card card = cardService.getCardByCardId(cardId);
        if(card.getBalance() == 0){
            cardService.deleteCardById(cardId);
        }
        return "redirect:/myCard";
    }

    @GetMapping("/createCard")
    public String createCard(){
        return "bankCard/createCard";
    }

    @PostMapping("/createCard")
    public String createCard(HttpServletRequest request, HttpSession session){
        String userNum = session.getAttribute("userNum").toString();
        int userId = userService.findUserByUserNum(userNum).getId();
        String cardNum = request.getParameter("cardNum");
        Date time = new java.sql.Date(new java.util.Date().getTime());
        Double balance = 0.0;
//        System.out.println(userId);
//        System.out.println(cardNum);
//        System.out.println(time);
//        System.out.println(balance);
        cardService.createCard(userId, cardNum, time, balance);
        return "redirect:/myCard";
    }
}
