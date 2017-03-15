package model;


public class Maintain extends Place {

    private long maintainId;
    private User owner;
    private Place place;
    private Account account;
    private Record record;
    private String status;

    public void reserve(int booking, String location, String description) {

    }

    public void changeStatus(String status) {

    }

    public void dismiss() {

    }

    public void checkStatus() {

    }

    public long getMaintainId() {
        return maintainId;
    }

    public void setMaintainId(long maintainId) {
        this.maintainId = maintainId;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
