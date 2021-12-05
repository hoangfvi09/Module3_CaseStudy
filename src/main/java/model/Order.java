package model;

import java.sql.Timestamp;
import java.util.Date;

public class Order {
    private int id;
    private int userId;
    private Timestamp time;
    private String address;
    private String phoneNo;

    public Order() {
    }

    public Order(int id, int userId, Timestamp time, String address, String phoneNo) {
        this.id = id;
        this.userId = userId;
        this.time = time;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public int getId() {
        return id;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
