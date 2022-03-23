package src.main.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import src.main.model.account.Account;

public class Bank { //In charge of managing accounts and transactions 
    private ArrayList <Account> accounts;
    private ArrayList<Transaction> transactions;



    //Constructor :Initializes each ArrayList
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
         //this.accounts.add(new Account(account)); //Can not create a type of account so will use clone method 
         this.accounts.add(account.clone()); //use the clone method from the correct class
     }
  
    /**
     * Name: addTransaction
     * @param transaction
     * 
     * Inside the function:
     *   1. adds a new transaction object to the array list.
     */

     public void addTransaction(Transaction transaction){
         //this.transactions.add(transaction); //Rookie mistake :You need to add a copy of transaction and not the original transaction
         this.transactions.add(new Transaction(transaction));
     }

    /**
     * Name: getTransactions
     * @param accoundId (String)
     * @return (Transaction[])
     * 
     * 1. returns an array of transactions whose id matches the accountId 
     */

     public Transaction[] getTransactions(String accountId){
        List<Transaction> list = this.transactions.stream()
        .filter((transaction) -> transaction.getId().equals(accountId))
        .collect(Collectors.toList());
        
        return list.toArray(new Transaction[list.size()]);
     }

      /**
   * Name: getAccount()
   * @param transactionId (String)
   * @return (Account)
   * 
   * 1. returns an account whose id matches a transaction. 
   */

   public Account getAccount(String transactionId){
    return accounts.stream()
        .filter((account) ->account.getId().equals(transactionId))//filter : Filters elements based on a predicate 
        .findFirst() //returns the element of the stream
        .orElse(null); //return null if findFirst does not return anything 
   }

   


}
