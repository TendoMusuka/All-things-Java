package src.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Imports all the parent and child classes in the model model/account file 
import src.main.model.account.*;
import src.main.model.*;
import src.main.model.Transaction;

public class Main {

    static String ACCOUNTS_FILE = "src/main/data/accounts.txt";            
    static String TRANSACTIONS_FILE = "src/main/data/transactions.txt";
    static Bank bank = new Bank ();
    static Bank bank2 = new Bank ();

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

        try {
            Account account5 = createObject(new String[] {
                "Chequing","f84c43f4-a634-4c57-a644-7602f8840870","Michael Scott","1524.51"});
            }catch (Exception e) {
            System.out.println(e.getMessage());
         }
    
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

     /**
     * Name: createObject
     * @param values (String[] values)
     * @return Account
     * 
     * Inside the function:
     *   1. Dynamically creates a Chequing, Loan, or Savings object based on the values array. 
     */

     public static Account createObject(String[] values) { 

        try {//uses the first part to determine which account to create
                return (Account) Class.forName("src.main.model.account." + values[0])
                        .getConstructor(String.class, String.class, double.class)
                        .newInstance(values[1], values[2], Double.parseDouble(values[3]));
            }catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
        }
         

        
        /**Alternative - Use the following syntax to dynamically create an object based on the first element in values.
         *   switch(values[0]){ 
          case "Chequing" : return new (Account) Chequing(values[1], values[2],  Double.parseDouble(values[3]));
                case "Savings" :return (Account) Savings(values[1], values[2],  Double.parseDouble(values[3]));
                case "Loan" :return (Account) Loan(values[1], values[2],  Double.parseDouble(values[3]));
         */

     }

     /**
     * Name: returnAccounts()
     * @return ArrayList<Account>
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *    1. Creates a Scanner object and reads the data from accounts.txt.
     *    2. Creates an Account object for every line in accounts.txt.
     *    3. Returns an ArrayList of Account objects.
     */
    public static ArrayList<Account> returnAccounts() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(ACCOUNTS_FILE);
        Scanner scan = new Scanner(fis);

        ArrayList<Account> accounts = new ArrayList<Account>();  

        while(scan.hasNextLine()){
            accounts.add(createObject(scan.nextLine().split(",")));
        }
        scan.close();
        return accounts;
    }



      /**
     * Name: loadAccounts
     * @param accounts (ArrayList<Account>)
     * Inside the function:
     *   1. Loads every account into the Bank object.
     */
    public static void loadAccounts(ArrayList<Account> accounts){
        for(Account account : accounts){
            bank.addAccount(account);
        }
    }



     /**
     * Name: returnTransactions()
     * @return ArrayList<Transaction>
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *    1. Creates a Scanner object and reads the data from transactions.txt.
     *    2. Populates an ArrayList with transaction objects.
     *    3. Sorts the ArrayList.
     */

     public static ArrayList<Transaction> returnTransactions() throws FileNotFoundException{
         FileInputStream fis = new FileInputStream(TRANSACTIONS_FILE);
         Scanner scan = new Scanner(fis);

         ArrayList <Transaction> transactions = new ArrayList <Transaction>();
         while(scan.nextLine() != null){
             String[] values = scan.nextLine().split(",");
             transactions.add(new Transaction(Transaction.Type.valueOf(values[1]), Long.parseLong(values[0]),
             values[2], Double.parseDouble(values[3])));
         }
         scan.close ();
         Collections.sort(transactions);
         return transactions;

     }

      /**
     * Name: runTransactions
     * @param transactions ArrayList<Transaction>
     * 
     * Inside the function:
     *  1. Executes every transaction using bank.execute.
     */
     public static void runTransactions(ArrayList<Transaction> transactions){
         for(Transaction transaction : transactions){
             bank.executeTransaction(transaction);
         }
     }


     
    /**
     * Name: transactionHistory
     * @param id (String)
     * 
     * Inside the function
     *   1. Print: \t\t\t\t   TRANSACTION HISTORY\n\t
     *   2. Print every transaction that corresponds to the id. (Waits 300 milliseconds before printing the next one)
     *             - Use this format "\t"+transaction+"\n"
     *   3. Print: \n\t\t\t\t\tAFTER TAX\n
     *   4. Print: "\t" + account that corresponds to id +"\n\n\n\n"
     */

     public static void transactionHistory(String id){
         System.out.println();
         for (Transaction transaction: bank.getTransactions(id) ) {
             wait(300);
             System.out.println("\t"+transaction+ "\n");
             System.out.println("\t" + bank.getAccount(id) +"\n\n\n\n");
         }
     }

}
