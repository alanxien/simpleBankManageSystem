package csu.db.bankmanage.service.impl;

import csu.db.bankmanage.domain.Message;
import csu.db.bankmanage.domain.Subscribe;
import csu.db.bankmanage.persistence.MessageMapper;
import csu.db.bankmanage.persistence.SubscribeMapper;
import csu.db.bankmanage.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private SubscribeMapper subscribeMapper;

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public Subscribe getServiceByUserNum(String userNum, String service){
        return subscribeMapper.getServiceByUserNum(userNum, service);
    }

    @Override
    public void addServiceByUserNum(String userNum, String service){
        subscribeMapper.addServiceByUserNum(userNum, service);
    }

    @Override
    public void cancelServiceByUserNum(String userNum, String service){
        subscribeMapper.cancelServiceByUserNum(userNum, service);
    }

    @Override
    public void addMessage(String userNum, String type, int status, String content, Date time){
        messageMapper.addMessage(userNum, type, status, content, time);
    }

    @Override
    public ArrayList<Message> findMessageRecordByUserNum(String userNum){
        return messageMapper.findMessageRecordByUserNum(userNum);
    }
}
