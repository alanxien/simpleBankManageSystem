package csu.db.bankmanage.domain;

import java.io.Serializable;

public class Subscribe implements Serializable {
    int id;
    String userNum;
    String service;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
