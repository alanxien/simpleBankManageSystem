package csu.db.bankmanage.persistence;

import csu.db.bankmanage.domain.Deposit;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;

@Component
public interface DepositMapper {
    void depositMoney(double cardId, Date time, double money);

    ArrayList<Deposit> findDepositRecordByUserId(int userId);
}
