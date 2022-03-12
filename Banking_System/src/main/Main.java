package src.main;

import java.util.concurrent.TimeUnit;

//Imports all the parent and child classes in the model model/account file 
import src.main.model.account.*;

public class Main {

    static String ACCOUNTS_FILE = "src/main/data/accounts.txt";            
    static String TRANSACTIONS_FILE = "src/main/data/transactions.txt";

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
