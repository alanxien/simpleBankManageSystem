package csu.db.bankmanage.service;

import csu.db.bankmanage.domain.Message;
import csu.db.bankmanage.domain.Subscribe;

import java.sql.Date;
import java.util.ArrayList;

public interface MessageService {
    Subscribe getServiceByUserNum(String userNum, String service);

    void addServiceByUserNum(String userNum, String service);

    void cancelServiceByUserNum(String userNum, String service);

    void addMessage(String userNum, String type, int status, String content, Date time);

    ArrayList<Message> findMessageRecordByUserNum(String userNum);
}
