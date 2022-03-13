package src.main.model.account;

import java.text.DecimalFormat;
import java.util.Objects;

//Define a class that can be a parent to savings, chequeing and loan for the sak of intheritance 
//Make it abstract so the developer can not define it
//Data isn't always perfect. Apply "quality control" inside the constructor and setters. 
//If a class incl
public abstract class Account {  //Account save as the parent for savings, chequeing and loan 
    private String id;
    private String name;
    private double balance;


    public Account() {
    }

    //Constructor 
    public Account(String id, String name, double balance) {
        if ( id == null || id.isBlank() || name == null || name.isBlank()){
         throw new IllegalArgumentException("INVALID PARAMS");
        }

        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Copy Constructors 
    //No need for quality control 
    public Account(Account source) {
        this.id = source.id;
        this.name = source.name;
        this.balance = source.balance;
    }

    //Getters and Setters
    //ID 
    public String getId() {
        if (id == null || id.isBlank())
        throw new IllegalArgumentException("INVALID ID");

        return this.id;
    }

    public void setId(String id) {
        if (id == null || id.isBlank())
        throw new IllegalArgumentException("INVALID ID");
        this.id = id;
    }

    //Name
    public String getName() {
        if (name == null || name.isBlank())
        throw new IllegalArgumentException("INVALID NAME");

        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank())
        throw new IllegalArgumentException("INVALID NAME");
        this.name = name;
    }

    //Balance
    public double getBalance() {

        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //returns a double number to the nearest two decimal figures 
    protected double round(double amount) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return Double.parseDouble(formatter.format(amount));
    }

    //Abstract methods that each child will override
    //An abstract method is a method that is declared without an implementation without braces, and followed by a semicolon 
    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract Account clone();


    //Equal Operator for Objects 
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Account)) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(name, account.name) && balance == account.balance;
    }

    //If you override the equal operator, you have to override the hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name, balance);
    }
 
    //Override To String so it prints the objects fields 
     @Override
    public String toString() {
        //getSimpleName() method of java Class class returns the simple name of the underlying class as given in the source code. In the case of an anonymous class, it returns an empty string.

        return (this.getClass().getSimpleName()) + "    " + //Gets classname of current object 
            "\t" + this.getId() + "" +
            "\t" + this.getName() + "" +
            "\t$" + this.getBalance() + "";
    }


    
}
