package org.example;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public String getAccountHolder()
    {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void deposite(double amount)
    {
        if(amount>0)
        {
            this.balance += amount;
            System.out.println("Diposited:" +amount);
        }
        else {
            System.out.println("Invalid deposite amount");
        }
    }

}
