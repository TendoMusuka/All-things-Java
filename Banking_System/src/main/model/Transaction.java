package src.main.model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;

import src.main.model.account.*;

public class Transaction implements Comparable<Transaction> {
    public enum Type {WITHDRAW, DEPOSIT};
    
    private Type type; 
    private long timestamp;
    private String id;
    private double amount;

    //CONSTRUCTOR 
    public Transaction(Type type, long timestamp, String id, double amount) {
        if (id == null || id.isBlank() || amount<0){ //checks if parameters passed are valid or not 
            throw new IllegalArgumentException("INVALID PARAMS");
        }


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


    //GETTERS AND SETTERS 
    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getId() {
        if (id==null || id.isBlank()){
            throw new IllegalArgumentException("ID is invalid");
        }
        return this.id;
    }

    public void setId(String id) {
        if (id==null || id.isBlank()){
            throw new IllegalArgumentException("ID is invalid");
        }
        this.id = id;
    }

    public double getAmount() {
        if(amount<0){
            throw new IllegalArgumentException("amount can not be less than zero");
        }
        return this.amount;
    }

    public void setAmount(double amount) {
        if(amount<0){
            throw new IllegalArgumentException("amount can not be less than zero");
        }
        this.amount = amount;
    }

    
    public String returnDate(){
        Date date = new Date(this.timestamp*1000);// Timestamp represents the number of seconds since 1970
        return new SimpleDateFormat("dd-MM-yyyy").format(date);
    }

    //withdrawTransaction and depositTransaction get the account that a transaction belongs to 
    //And executes the transaction.


    //Override Equals and HashCode 
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) o;
        return Objects.equals(type, transaction.type) && timestamp == transaction.timestamp && Objects.equals(id, transaction.id) && amount == transaction.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, timestamp, id, amount);
    }

    @Override //need to override compareTo since you implemented Compare
    public int compareTo(Transaction o) {
        // TODO Auto-generated method stub
        return Double.compare(this.timestamp, o.timestamp); 
    }

    //Override toString 
    @Override
    public String toString() {
        return
            " type='"  + "'" +
            ", timestamp='" + this.returnDate() + "'" +
            ", id='" + getId() + "'" +
            ", amount='" + getAmount() + "'" ;
    }

    
    

}
