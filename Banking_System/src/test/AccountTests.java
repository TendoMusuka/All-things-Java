package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.main.model.account.*;
import src.main.model.account.impl.*;

public class AccountTests {

    Account[] accounts;

    //Before runs before each test 
    @Before
    public void setup(){

        accounts = new Account[]{
            new Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51),
            new Savings("ce07d7b3-9038-43db-83ae-77fd9c0450c9", "Saul Goodman", 2241.60),
            new Loan("4991bf71-ae8f-4df9-81c1-9c79cff280a5", "Phoebe Buffay", 2537.31),
        };
    }

    //Test withdrawal 
    //1. Test withdrawal with no overdraft  
    @Test
    public void withdrawal(){
        accounts[0].withdraw(1440);
        assertEquals(84.51, accounts[0].getBalance());
    }

    @Test 
    public void overdraft(){
        accounts[0].withdraw(1534.43);
        assertEquals(-15.42, accounts[0].getBalance());
    }

    @Test 
    public void withdrawalLimitExceeded(){
        accounts[0].withdraw(2000);
        assertEquals(1524.51, accounts[0].getBalance());
    }

    //Testing withdrawal fee from the savings account 
    @Test 
    public void withdrawalFee(){
        accounts[1].withdraw(100);
        assertEquals(2136.60, accounts[1].getBalance());
    }

    //Testing withdrawal interest from the loan
    @Test
    public void withdrawalInterest(){
        accounts[2].withdraw(2434.31);
        assertEquals(5020.31, accounts[2].getBalance());
    }


    @Test
    //Testing withdrawal limit from the loan account
    public void withdrawalLimit(){
        accounts[2].withdraw(7463.69);
        assertEquals(2537.31, accounts[2].getBalance());
    }

    //Test depositing in the chequing account 
    @Test
    public void deposit(){
        accounts[1].deposit(5000);
        assertEquals(6524.51, accounts[1].getBalance());
    }

    //Test  depositing 1 000 in the loan account
    @Test 
    public void loanDeposit(){
        accounts[2].deposit(1000);
        assertEquals(1537.31, accounts[2].getBalance());
    }

    //Tests that income deposited in chequing account will be taxable 

    
    //Chequing Balance is 1524.51
    @Test
    public void incomeTax(){
        double income = 4000;
        accounts[0].deposit(income);

        ((Taxable)accounts[0]).tax(4000);
        assertEquals(5374.51, accounts[0].getBalance());

    }





}
