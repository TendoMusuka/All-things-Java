package src.main.model;

import src.main.model.account.*;

public class Transaction {

    Account type;
    long timestamp;
    String id;
    double amount;

    //CONSTRUCTOR 
    public Transaction(Account type, long timestamp, String id, double amount) {
        this.type = type;
        this.timestamp = timestamp;
        this.id = id;
        this.amount = amount;
    }

    //COPY CONSTRUCTORS 
    public Transaction(Transaction source) {
        this.type = source.type;
        this.timestamp = source.timestamp;
        this.id = source.id;
        this.amount = source.amount;
    }


    //COPY CONSTRUCTOR 

    //GETTERS AND SETTERS 
    public Account getType() {
        return this.type;
    }

    public void setType(Account type) {
        this.type = type;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    

}
