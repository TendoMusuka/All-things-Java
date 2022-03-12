package src.main.model.account;

import javax.xml.transform.Source;

import src.main.model.account.impl.Taxable;

public class Chequing extends Account implements Taxable { 
    private static final double OVERDRAFT_FEE= 5.5;
    private static final double OVERDRAFT_LIMIT = 200;

    private static final double TAX = 0.15;
    private static final double TAXABLE_INCOME = 3000;

    public double overdraftAmount;

    //Each child needs a constructor that synchronizes with the parent constructor
    public Chequing (String id, String name, double balance){
        //Update the fields that our child is going to inherit 
        super(id, name, balance);  //calls parent in the main construtoc 
    }

    //Create a copy constructor that synchronizes with the parent constructor 
    public Chequing (Chequing source){
        super(source);
    }



    //Overriding deposit and withdraw methods which were defined by the parents
    /**A chequing account allows users to deposit or withdraw an amount of money.
     * The chequing account charges an overdraft fee of $5.50 if the amount being withdrawn exceeds the account balance.
     * The overdraft limit is $200.00 dollars.
     */
    public void deposit(double amount){
        super.setBalance(super.getBalance()+amount);
       
    }
    public boolean withdraw (double amount){
        if( super.getBalance() >= amount){ //If there is no overdraft subtract money withdrawn
            super.setBalance(super.round(super.getBalance() - amount ));
            return true;
        }
        else if ( (amount- super.getBalance()- OVERDRAFT_FEE) <= OVERDRAFT_LIMIT ){ //Overdraft limit not exceeded 
            super.setBalance(super.round( super.getBalance() - amount - OVERDRAFT_FEE));
            return true;
        }
        else {
            return false ;
        }
    
    }

    //A chequing account is taxable. 
    //Income that exceeds $3,000 is taxed 15%.
    @Override
    public void tax(double income) {
        if (income>3000){
            super.setBalance(super.round(super.getBalance()-TAX*(income - TAXABLE_INCOME)));
        }
        else{
            super.setBalance(super.getBalance()-income);
        }
        
    }
   
}
