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

    //the line below is from class
    //public BankAccount (double balance, String accountNumber) {

    public BankAccount (String accountNumber) {
        //the line below is from class
        //this.balance = balance;

        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    //Getters

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }



    //Setters


    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double deposit) { this.balance += deposit; }
    public boolean withdraw(double withdrawal) {
        if (getBalance() > withdrawal) {
            balance -= withdrawal;
            return true;
        } else {
            return false;
        }
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account number: " + this.accountNumber + ", balance: " + this.balance;
    }
}
