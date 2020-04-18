package csu.db.bankmanage.service;

import csu.db.bankmanage.domain.Record;
import csu.db.bankmanage.domain.User;

import java.util.ArrayList;

public interface UserService {
    // 增加用户到登录表中
    void insertUser(String userNum, String password);

    // 注册用户所有信息
    void registerUser(String firstName, String lastName, String userNum);

    User findUserByUserNum(String userNum);

    String findUserByIDANDPassword(String userNum, String password);

    void updateUserInfoByUserNum(String firstName, String lastName, String phone, String email, String position,
                                 String city, String address, String description, String userNum);

    void changePassword(String userNum, String newPassword);
}
