package csu.db.bankmanage.persistence;

import csu.db.bankmanage.domain.Withdraw;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;

@Component
public interface WithdrawMapper {

    void withdrawMoney(double cardId, Date time, double money);

    ArrayList<Withdraw> findWithdrawRecordByUserId(int userId);
}
