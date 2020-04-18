package csu.db.bankmanage.persistence;

import csu.db.bankmanage.domain.Message;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;

@Component
public interface MessageMapper {
    void addMessage(String userNum, String type, int status, String content, Date time);

    ArrayList<Message> findMessageRecordByUserNum(String userNum);
}
