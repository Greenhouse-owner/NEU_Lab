/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4objectpart.model;

/**
 * 账户实体类
 * 包含银行账户的基本信息：路由号、账户号、银行名称、余额
 * 
 * @author Administrator
 */
public class Account {
    
    private String routingNumber;    // 路由号
    private String accountNumber;    // 账户号
    private String bankName;         // 银行名称
    private double balance;          // 余额
    
    /**
     * 默认构造函数
     */
    public Account() {
        this.balance = 0.0;
    }
    
    /**
     * 带参数的构造函数
     * @param routingNumber 路由号
     * @param accountNumber 账户号
     * @param bankName 银行名称
     * @param balance 余额
     */
    public Account(String routingNumber, String accountNumber, String bankName, double balance) {
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    // Getter 和 Setter 方法
    
    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /**
     * 重写 toString 方法，方便调试
     * @return 账户信息字符串
     */
    @Override
    public String toString() {
        return "Account{" +
                "routingNumber='" + routingNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", bankName='" + bankName + '\'' +
                ", balance=" + balance +
                '}';
    }
}

