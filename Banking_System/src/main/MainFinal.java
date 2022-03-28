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

public class MainFinal {

    static String ACCOUNTS_FILE = "src/main/data/accounts.txt";            
    static String TRANSACTIONS_FILE = "src/main/data/transactions.txt";
    static Bank bank = new Bank ();
    static Bank bank2 = new Bank ();

    public static void main(String[] args) {

        try {
            ArrayList<Account> accounts = returnAccounts();
            loadAccounts(accounts);

            ArrayList<Transaction> transactions = returnTransactions();
            runTransactions(transactions);
            bank.deductTaxes();
            for (Account account : accounts) {
                System.out.println("\n\t\t\t\t\t ACCOUNT\n\n\t"+account+"\n\n");
                transactionHistory(account.getId());
            }
            
         } catch (FileNotFoundException e) {
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
         while(scan.hasNextLine()){
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
