package csu.db.bankmanage.domain;

import java.io.Serializable;
import java.sql.Date;

public class Card implements Serializable {
    private int id;
    private double userId;
    private String cardNum;
    private Date createTime;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUserId() {
        return userId;
    }

    public void setUserId(double userId) {
        this.userId = userId;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
