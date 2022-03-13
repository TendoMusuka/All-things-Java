package src.main.model;

import java.util.ArrayList;

import src.main.model.account.Account;

public class Bank {
    private ArrayList <Account> accounts;
    private ArrayList<Transaction> transactions;



    //Constructor 
    public Bank() {
        this.accounts = new ArrayList<Account>();
        this.transactions = new ArrayList<Transaction>();
    }


     /**
     * Name: addAccount
     * @param account (Account)
     * 
     * Inside the function:
     *   1. adds an account to the accounts ArrayList
     */

     public void addAccount(Account account){
         this.accounts.add(account);
     }
  
    /**
     * Name: addTransaction
     * @param transaction
     * 
     * Inside the function:
     *   1. adds a new transaction object to the array list.
     */

     public void addTransaction(Transaction transaction){
         this.accounts.add(transaction);
     }

    /**
     * Name: getTransactions
     * @param accoundId (String)
     * @return (Transaction[])
     * 
     * 1. returns an array of transactions whose id matches the accountId 
     */



}
