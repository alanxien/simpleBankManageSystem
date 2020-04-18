package csu.db.bankmanage.persistence;

import csu.db.bankmanage.domain.RepayLoan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public interface RepayLoanMapper {

    ArrayList<RepayLoan> findRepayLoanRecordByUserId(int userId);
}
