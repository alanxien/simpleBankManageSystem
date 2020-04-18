package csu.db.bankmanage.service;

import csu.db.bankmanage.domain.*;

import java.sql.Date;
import java.util.ArrayList;

public interface CardService {
    // 新建卡
    void createCard(int userId, String cardNum, Date time, Double balance);

    ArrayList<Card> findCardsByUserNum(String userNum);

    Card getCardByCardNum(String cardNum);

    Card getCardByCardId(double cardId);

    void deleteCardById(double cardId);

    ArrayList<Deposit> findDepositRecordByUserNum(String userNum);

    ArrayList<Withdraw> findWithdrawRecordByUserNum(String userNum);

    ArrayList<Loan> findLoanRecordByUserNum(String userNum);

    ArrayList<RepayLoan> findRepayLoanRecordByUserNum(String userNum);

}
