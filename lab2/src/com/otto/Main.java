package com.otto;

public class Main {

    public static void main(String[] args) {
        /*
	    BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.toString());
        //the line below is from class
	    //BankAccount bankAccount1 = new BankAccount(10, "1234");
        BankAccount bankAccount1 = new BankAccount("1234");
        System.out.println(bankAccount1.toString());
        //bankAccount

        System.out.println(bankAccount1.getBalance());
        bankAccount.setAccountNumber("ASD");
        System.out.println(bankAccount.getAccountNumber());

         */

        //---------------------------
        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());

        account1.deposit(1000);
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());

        boolean result = account1.withdraw(500);
        if (!result) {
            System.out.println("You do not have sufficient funds for this operation!");
        }

        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());

        result = account1.withdraw(1000);
        if (!result) {
            System.out.println("You do not have sufficient funds for this operation!");
        }
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());

        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());
        account2.deposit(2000);
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());
//
    }
}































