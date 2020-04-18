package csu.db.bankmanage.service.impl;

import csu.db.bankmanage.domain.User;
import csu.db.bankmanage.persistence.SignOnMapper;
import csu.db.bankmanage.persistence.UserMapper;
import csu.db.bankmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SignOnMapper signOnMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(String userNum, String password) {
        signOnMapper.insertUser(userNum, password);
    }

    @Override
    public void registerUser(String firstName, String lastName, String userNum){
        userMapper.registerUser(firstName, lastName, userNum);
    }

    @Override
    public User findUserByUserNum(String userNum) {
        return userMapper.findUserByUserNum(userNum);
    }

    @Override
    public String findUserByIDANDPassword(String userNum, String password) {
        return signOnMapper.findUserByIDANDPassword(userNum, password);
    }

    @Override
    public void updateUserInfoByUserNum(String firstName, String lastName, String phone, String email, String position,
                                        String city, String address, String description, String userNum){
        userMapper.updateUserInfoByUserNum(firstName, lastName, phone, email, position, city, address, description, userNum);
    }

    @Override
    public void changePassword(String userNum, String newPassword){
        signOnMapper.changePassword(userNum, newPassword);
    }
}
