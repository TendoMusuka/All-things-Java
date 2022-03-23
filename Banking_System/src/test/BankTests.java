package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Before;
import org.junit.Test;

import src.main.model.*;
import src.main.model.account.*;

public class BankTests {
    
Bank bank;

  @Before
  //Variables/parameters set before each test 
  public void setup() {
      bank = new Bank();
      bank.addAccount(new Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51));
    }

    /**
     * Tested withdrawTransaction & depositTransaction while they were public 
     * Cannot test private functions
     */
    //must assert getTransactions("f84c43f4-a634-4c57-a644-7602f8840870").length 
    //returns 2 after a successful withdrawal and deposit.
    @Test
    public void successfulTransaction() {
        this.bank.executeTransaction(new Transaction(Transaction.Type.WITHDRAW, 1546905600, "f84c43f4-a634-4c57-a644-7602f8840870", 624.99));
        this.bank.executeTransaction(new Transaction(Transaction.Type.DEPOSIT, 1578700800, "f84c43f4-a634-4c57-a644-7602f8840870", 441.93));
        assertEquals(2, bank.getTransactions("f84c43f4-a634-4c57-a644-7602f8840870").length); //the bank has 2 transactions after a successful withdrawal and deposit
    }

    //failedTransaction must assert getTransactions("f84c43f4-a634-4c57-a644-7602f8840870").length 
    //returns 0 after a failed withdrawal.
    @Test 
    public void failedTransaction(){
    this.bank.executeTransaction(new Transaction(Transaction.Type.WITHDRAW, 1546905600, "f84c43f4-a634-4c57-a644-7602f8840870", 10000000));
    assertEquals(0, bank.getTransactions("f84c43f4-a634-4c57-a644-7602f8840870").length);
    }
}
