package csu.db.bankmanage.persistence;

import csu.db.bankmanage.domain.Card;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;

@Component
public interface CardMapper {

    Card getCardByCardNum(String cardNum);

    void createCard(int userId, String cardNum, Date time, Double balance);

    ArrayList<Card> findCardsByUserId(int userId);

    Card getCardByCardId(double cardId);

    void deleteCardById(double cardId);
}
