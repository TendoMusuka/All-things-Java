package src.main.model.account;

public class Loan extends Account {
    private final static  double  INTEREST_RATE = 0.02;

     //Each child needs a constructor that synchronizes with the parent constructor
     public Loan (String id, String name, double balance){
        //Update the fields that our child is going to inherit 
        super(id, name, balance);  //calls parent in the main construtoc 
    }

    //Create a copy constructor that synchronizes with the parent constructor 
    //Calls parent copy constructor 
    public Loan (Chequing source){
        super(source);
    }

    //Overriding deposit and withdraw methods which were defined by the parents
    /**
     * A loan account allows users to deposit or withdraw an amount of money.
     * A withdrawal can't made if the debt exceeds $10,000.
     * Every withdrawal is charged a fixed interest rate of 2%.
     */

    public void deposit(double amount){
        super.setBalance(this.getBalance()-amount);
    }

    public boolean withdraw (double amount){
        if((super.getBalance() + amount*1.02) > 10000){ //loan balance can not exceed 10 000

            return false;
        }
        //if debt does not exceed $10 000  withdrawal is approved
        //Loan amount increases with every withdrawal
        //Charge a fixed interest rate for 2%
        super.setBalance(super.round(super.getBalance() + (1+INTEREST_RATE)*amount));
        return true;
    }

}
