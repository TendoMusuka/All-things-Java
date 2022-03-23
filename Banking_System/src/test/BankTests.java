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

    /**
     * Name: getIncome
     * @param account (Taxable)
     * @return double
     * 
     * Inside the function:
     *   1. Gets every transaction that matches the account's id.
     *   2. Maps every transaction to a double.
     *       - Transactions of type WITHDRAW are mapped to negative numbers.
     *       - Transactions of type DEPOSIT are mapped to positive numbers.
     *   3. Takes the sum of every number and returns the income.
     * 
     */

    //
    @Test 
    public void taxDeduction(){
        this.bank.executeTransaction(new Transaction(Transaction.Type.DEPOSIT, 1578700800, "f84c43f4-a634-4c57-a644-7602f8840870", 4000));
        this.bank.deductTaxes();
        assertEquals(5374.51, bank.getAccount("f84c43f4-a634-4c57-a644-7602f8840870").getBalance());
    }
    
    
    @Test
    public void taxDeduction2() {
        this.bank.executeTransaction(new Transaction(Transaction.Type.DEPOSIT, 1578700800, "f84c43f4-a634-4c57-a644-7602f8840870", 4000));
        this.bank.executeTransaction(new Transaction(Transaction.Type.WITHDRAW, 1578700800, "f84c43f4-a634-4c57-a644-7602f8840870", 500));
    
        this.bank.deductTaxes();
        assertEquals(4949.51, bank.getAccount("f84c43f4-a634-4c57-a644-7602f8840870").getBalance());
    }


}
