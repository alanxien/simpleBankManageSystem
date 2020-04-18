package csu.db.bankmanage.service;

import java.sql.Date;

public interface MoneyService {

    void depositMoney(double cardId, Date time, double money);

    void withdrawMoney(double cardId, Date time, double money);

    void dealLoan(double cardId, Date time, double money);

    void repayLoan(double cardId, Date time, double money);
}
