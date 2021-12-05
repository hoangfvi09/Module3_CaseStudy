package model;

import java.sql.Timestamp;

public class Review {
    private int userId;
    private int productId;
    private String content;
    private int rate;
    private Timestamp date;

    public Review(int userId, int productId, String content, int rate, Timestamp date) {
        this.userId = userId;
        this.productId = productId;
        this.content = content;
        this.rate = rate;
        this.date = date;
    }

    public Review() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
