package src.main;

import java.util.concurrent.TimeUnit;

//Imports all the parent and child classes in the model model/account file 
import src.main.model.account.*;
import src.main.model.*;

public class Main {

    static String ACCOUNTS_FILE = "src/main/data/accounts.txt";            
    static String TRANSACTIONS_FILE = "src/main/data/transactions.txt";
    static Bank bank = new Bank ();

    public static void main(String[] args) {

        //Testing to see if my parent and child class work 
        //Add three breakpoints and visualize the runtime. Confirm that each object is using its parent's constructor to update its fields.
        Chequing chequing = new Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51);
        Savings savings = new Savings("ce07d7b3-9038-43db-83ae-77fd9c0450c9", "Saul Goodman", 2241.60);
        Loan loan = new Loan("4991bf71-ae8f-4df9-81c1-9c79cff280a5", "Phoebe Buffay", 2537.31);

        //Tests to see to String method is working for all classes
        System.out.println(chequing);
        System.out.println(savings);
        System.out.println(loan);

        Chequing chequing1 = new Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51);
        Account chequingCopy = chequing1.clone();
      
        Savings savings1 = new Savings("ce07d7b3-9038-43db-83ae-77fd9c0450c9", "Saul Goodman", 2241.60);
        Account savingsCopy = savings1.clone();

        /**
         * The code:
         * Loops through an array of accounts and adds them to a Bank object.
         * Loops through an array of transactions and adds to them to the same Bank object.
         * Gets every the transaction that matches the account: "f84c43f4-a634-4c57-a644-7602f8840870
         */
        Account[] accounts = new Account[] {
            new Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51),
            new Savings("ce07d7b3-9038-43db-83ae-77fd9c0450c9", "Saul Goodman", 2241.60)
        };

        //runs through every account in the account array and adds it to bank
        for (Account account : accounts) {
            bank.addAccount(account);
        }

        Transaction[] transactions = new Transaction[] {
            new Transaction(Transaction.Type.WITHDRAW, 1546905600, "f84c43f4-a634-4c57-a644-7602f8840870", 624.99),
            new Transaction(Transaction.Type.DEPOSIT, 1578700800, "f84c43f4-a634-4c57-a644-7602f8840870", 441.93),
            new Transaction(Transaction.Type.WITHDRAW, 1547078400, "f84c43f4-a634-4c57-a644-7602f8840870", 546.72),
            new Transaction(Transaction.Type.WITHDRAW, 1546732800, "f84c43f4-a634-4c57-a644-7602f8840870", 546.72),
            new Transaction(Transaction.Type.DEPOSIT, 1578355200, "f84c43f4-a634-4c57-a644-7602f8840870", 635.95),
            new Transaction(Transaction.Type.WITHDRAW, 1547078400, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 875.64),
            new Transaction(Transaction.Type.WITHDRAW, 1578614400, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 912.45),
            new Transaction(Transaction.Type.WITHDRAW, 1577836800, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 695.09),
            new Transaction(Transaction.Type.WITHDRAW, 1609459200, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 917.21),
            new Transaction(Transaction.Type.WITHDRAW, 1578096000, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 127.94),
            new Transaction(Transaction.Type.WITHDRAW, 1546819200, "ce07d7b3-9038-43db-83ae-77fd9c0450c9", 612.52)
        };

        //runs through every Transaction in the transaction account and adds it to bank 
        //made Transaction private as the caller is forbidden to authorize a transaction 
        //it is up to the bank to make a transaction or not
        /** 
        *for (Transaction transaction : transactions) {
        *    bank.addTransaction(transaction);
        *}
        */
        
        //filters accounts with the matching ID
        Transaction[] filteredTransactions = bank.getTransactions("f84c43f4-a634-4c57-a644-7602f8840870");
        
        Account account = bank.getAccount("ce07d7b3-9038-43db-83ae-77fd9c0450c9");
    
    }
    /**
     * Function name: wait
     * @param milliseconds
     * 
     * Inside the function:
     *  1. Makes the code sleep for X milliseconds.
     */

     public static void wait(int milliseconds) {
         try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }

}
