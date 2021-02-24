package com.otto;

public class Main {

    public static void main(String[] args) {
	    BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.toString());
	    BankAccount bankAccount1 = new BankAccount(10, "1234");
        System.out.println(bankAccount1.toString());
        //bankAccount

        System.out.println(bankAccount1.getBalance());
        bankAccount.setAccountNumber("ASD");
        System.out.println(bankAccount.getAccountNumber());
    }
}
