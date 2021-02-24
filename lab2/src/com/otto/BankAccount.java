package com.otto;

public class BankAccount {

    //Egységbezárás (encapsulation)
    //Attributes (tulajdonságok)
    private String accountNumber; //ha ez public static, akkor el tudom érni anélkül hogy létrehozzak bankszámlát

    private double balance;

    //Methods

    //Constructor - initialization
    //bármennyi konstruktorunk lehet
    //new használatakor hívódik meg
    public BankAccount() {
        this.balance = 0;
        this.accountNumber = "XYZ";
    }

    public BankAccount (double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    //Getters

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    //Setters

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account number: " + this.accountNumber + ", balance: " + this.balance;
    }
}
