/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4objectpart.model;

import java.util.ArrayList;

/**
 * 账户目录管理类
 * 负责管理所有账户的集合，提供 CRUD 操作
 * 
 * @author Administrator
 */
public class AccountDirectory {
    
    private ArrayList<Account> accounts;
    
    /**
     * 构造函数，初始化账户列表
     */
    public AccountDirectory() {
        this.accounts = new ArrayList<>();
    }
    
    /**
     * 获取所有账户列表
     * @return 账户列表
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    
    /**
     * 创建并添加新账户
     * @return 新创建的账户对象
     */
    public Account createAccount() {
        Account account = new Account();
        accounts.add(account);
        return account;
    }
    
    /**
     * 添加账户到目录
     * @param account 要添加的账户
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    /**
     * 删除指定账户
     * @param account 要删除的账户
     * @return 删除成功返回 true，否则返回 false
     */
    public boolean deleteAccount(Account account) {
        return accounts.remove(account);
    }
    
    /**
     * 根据账户号搜索账户
     * @param accountNumber 账户号
     * @return 找到的账户，如果没找到返回 null
     */
    public Account searchAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() != null && 
                account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    
    /**
     * 根据账户号搜索所有匹配的账户（模糊搜索）
     * @param accountNumber 账户号关键字
     * @return 匹配的账户列表
     */
    public ArrayList<Account> searchAccounts(String accountNumber) {
        ArrayList<Account> result = new ArrayList<>();
        for (Account account : accounts) {
            if (account.getAccountNumber() != null && 
                account.getAccountNumber().contains(accountNumber)) {
                result.add(account);
            }
        }
        return result;
    }
    
    /**
     * 更新账户信息
     * @param oldAccount 旧账户对象
     * @param newAccount 新账户对象
     * @return 更新成功返回 true，否则返回 false
     */
    public boolean updateAccount(Account oldAccount, Account newAccount) {
        int index = accounts.indexOf(oldAccount);
        if (index != -1) {
            accounts.set(index, newAccount);
            return true;
        }
        return false;
    }
    
    /**
     * 获取账户总数
     * @return 账户数量
     */
    public int getAccountCount() {
        return accounts.size();
    }
    
    /**
     * 清空所有账户
     */
    public void clearAll() {
        accounts.clear();
    }
}

