/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 * @author achiko
 */
public class AccountDirectory {
    private ArrayList<Account> accounts;

    public AccountDirectory() {
        this.accounts = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public Account addAccount() {
        Account a = new Account();
        accounts.add(a);
        return a;
    }

    public void deleteAccount(Account account) {
        accounts.remove(account);
    }
    
    /**
     * Search accounts
     * @param searchText Search keyword
     * @return List of matching accounts
     */
    public ArrayList<Account> searchAccounts(String searchText) {
        ArrayList<Account> results = new ArrayList<Account>();
        String lowerSearchText = searchText.toLowerCase();
        
        for (Account account : accounts) {
            // Search in bank name, routing number, account number
            if (account.getBankName().toLowerCase().contains(lowerSearchText) ||
                account.getRoutingNumber().toLowerCase().contains(lowerSearchText) ||
                account.getAccountNumber().toLowerCase().contains(lowerSearchText)) {
                results.add(account);
            }
        }
        
        return results;
    }
}
