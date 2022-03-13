package src.main.model;

import java.util.ArrayList;

import src.main.model.account.Account;

public class Bank {
    ArrayList <Account> accounts;
    ArrayList<Transaction> transactions;



    public Bank(ArrayList<Account> accounts, ArrayList<Transaction> transactions) {
        this.accounts = accounts;
        this.transactions = transactions;
    }


    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

     /**
     * Name: addAccount
     * @param account (Account)
     * 
     * Inside the function:
     *   1. adds an account to the accounts ArrayList
     */
  
}
