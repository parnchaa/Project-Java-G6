package model;


public class Location extends Place {

    private long accountId;
    private Place place;
    private String status;
    private double balance;
    private Transaction transaction;

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    public void findById(long accountId) {

    }

    public void query() {

    }

    public void addTransaction() {

    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

}
