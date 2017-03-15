package model;


import java.util.Date;
import java.util.HashMap;

public class Transaction extends Account {

    private long transactionId, userId;
    private HashMap<String, String> transactionDescription;
    private String transactionCode;
    private Date transactionDateTime;
    private double amount;

    public String gettransactionDescription(long accountId) {
        return "";
    }

    public void query() {

    }

    public void writeTransaction(long accountId) {

    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public HashMap<String, String> getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(HashMap<String, String> transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public Date getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(Date transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
