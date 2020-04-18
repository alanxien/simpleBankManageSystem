package csu.db.bankmanage.service.impl;

import csu.db.bankmanage.domain.*;
import csu.db.bankmanage.persistence.*;
import csu.db.bankmanage.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardMapper cardMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DepositMapper depositMapper;

    @Autowired
    private WithdrawMapper withdrawMapper;

    @Autowired
    private LoanMapper loanMapper;

    @Autowired
    private RepayLoanMapper repayLoanMapper;

    @Override
    public void createCard(int userId, String cardNum, Date time, Double balance) {
        cardMapper.createCard(userId, cardNum, time, balance);
    }

    @Override
    public ArrayList<Card> findCardsByUserNum(String userNum){
        ArrayList<Card> cardList;
        int userId = userMapper.findUserByUserNum(userNum).getId();
        cardList = cardMapper.findCardsByUserId(userId);
        return cardList;
    }

    @Override
    public Card getCardByCardNum(String cardNum){
        return cardMapper.getCardByCardNum(cardNum);
    }

    @Override
    public Card getCardByCardId(double cardId){
        return cardMapper.getCardByCardId(cardId);
    }

    @Override
    public void deleteCardById(double cardId){
        cardMapper.deleteCardById(cardId);
    }

    @Override
    public ArrayList<Deposit> findDepositRecordByUserNum(String userNum){
        int userId = userMapper.findUserByUserNum(userNum).getId();
        return depositMapper.findDepositRecordByUserId(userId);
    }

    @Override
    public ArrayList<Withdraw> findWithdrawRecordByUserNum(String userNum){
        int userId = userMapper.findUserByUserNum(userNum).getId();
        return withdrawMapper.findWithdrawRecordByUserId(userId);
    }

    @Override
    public ArrayList<Loan> findLoanRecordByUserNum(String userNum){
        int userId = userMapper.findUserByUserNum(userNum).getId();
        return loanMapper.findLoanRecordByUserId(userId);
    }

    @Override
    public ArrayList<RepayLoan> findRepayLoanRecordByUserNum(String userNum){
        int userId = userMapper.findUserByUserNum(userNum).getId();
        return repayLoanMapper.findRepayLoanRecordByUserId(userId);
    }

}
