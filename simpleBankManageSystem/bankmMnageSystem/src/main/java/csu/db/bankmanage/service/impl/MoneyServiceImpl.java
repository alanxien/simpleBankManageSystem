package csu.db.bankmanage.service.impl;

import csu.db.bankmanage.persistence.DepositMapper;
import csu.db.bankmanage.persistence.LoanMapper;
import csu.db.bankmanage.persistence.WithdrawMapper;
import csu.db.bankmanage.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private DepositMapper depositMapper;

    @Autowired
    private WithdrawMapper withdrawMapper;

    @Autowired
    private LoanMapper loanMapper;

    @Override
    public void depositMoney(double cardId, Date time, double money){
        depositMapper.depositMoney(cardId, time, money);
    }

    @Override
    public void withdrawMoney(double cardId, Date time, double money){
        withdrawMapper.withdrawMoney(cardId, time, money);
    }

    @Override
    public void dealLoan(double cardId, Date time, double money){
        loanMapper.dealLoan(cardId, time, money);
    }

    @Override
    public void repayLoan(double cardId, Date time, double money){
        loanMapper.repayLoan(cardId, time, money);
    }
}
