package csu.db.bankmanage.persistence;

import org.springframework.stereotype.Component;

@Component
public interface SignOnMapper {
    void insertUser(String userNum, String password);

    String findUserByIDANDPassword(String userNum, String password);

    void changePassword(String userNum, String newPassword);
}
