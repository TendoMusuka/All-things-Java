package src.main.model.account;

public class Savings extends Account {
    static final double WITHDRAWAL_FEE = 5.00 ;

    //Each child needs a constructor that synchronizes with the parent constructor
    public Savings (String id, String name, double balance){
        //Update the fields that our child is going to inherit 
        //borrows super constructor 
        super(id, name, balance);  //calls parent in the main construtoc 
    }

    //Create a copy constructor that synchronizes with the parent constructor 
    //Calls parent copy constructor 
    /**
     * A savings account allows users to deposit or withdraw an amount of money.
     * Deposits are free, but the savings account charges a $5.00 fee for every withdrawal
     */
    public Savings (Savings source){
        super(source);
    }

    //Overriding deposit and withdraw methods which were defined by the parents
    public void deposit(double amount){
        this.setBalance(super.getBalance()+amount);
    }
    public boolean withdraw (double amount){
     this.setBalance(super.round(super.getBalance() - amount - WITHDRAWAL_FEE));
        return true;
    }

    @Override
    public Account clone() {
        // TODO Auto-generated method stub
        return new Savings(this);
    }



}
