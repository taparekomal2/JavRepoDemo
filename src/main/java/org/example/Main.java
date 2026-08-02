package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount ac=new BankAccount();
        ac.setAccountHolder("Komal");
        ac.deposite(500.00);
        System.out.println("Account holder:"+ac.getAccountHolder());
        System.out.println("Current balance"+ac.getBalance());
        System.out.println("Project endedgit");
        System.out.println("Hello!!");
    }
}