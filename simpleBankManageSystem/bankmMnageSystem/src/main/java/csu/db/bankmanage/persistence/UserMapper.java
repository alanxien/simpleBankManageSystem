package csu.db.bankmanage.persistence;

import csu.db.bankmanage.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    void registerUser(String firstName, String lastName, String userNum);

    User findUserByUserNum(String userNum);

    void updateUserInfoByUserNum(String firstName, String lastName, String phone, String email, String position,
                                 String city, String address, String description, String userNum);
}
