package csu.db.bankmanage.persistence;

import csu.db.bankmanage.domain.Loan;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;

@Component
public interface LoanMapper {

    void dealLoan(double cardId, Date time, double money);

    void repayLoan(double cardId, Date time, double money);

    ArrayList<Loan> findLoanRecordByUserId(int userId);
}
