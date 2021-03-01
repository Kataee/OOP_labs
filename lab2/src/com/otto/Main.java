package com.otto;

import java.util.Random;


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

        //EXERCIESE 2
        Rectangle[] rectangles = new Rectangle[ 10 ];
        Random rand = new Random();
        double length;
        double width;

        for (int i=0; i<10; ++i) {
            length = 1 + rand.nextInt(10);
            width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
        }

        for (int i=0; i<10; ++i) {
            System.out.printf("%.2f %.2f %.2f %.2f\n", rectangles[i].getLength(), rectangles[i].getWidth(), rectangles[i].getArea(), rectangles[i].getPerimeter());
        }

        double totalArea=0;

        for (int i=0; i<10; ++i) {
            totalArea += rectangles[i].getArea();
        }

        System.out.println("A teljes terulet: " + totalArea);

        System.out.println("year: " + dateUtil.leapYear(2400));
        System.out.println("date: " + dateUtil.isValidDate("2021-02-29"));

        MyDate date1 = new MyDate(2024, 2,29);
        System.out.println(date1.getYear());
        date();

    }

    public static void date() {
        Random rand = new Random();
        int year, month, day, numberOfInvalid=0;


        for (int i=0; i<3; ++i) {
            year = 1 + rand.nextInt(2021);
            month = 1 + rand.nextInt(12);
            day = 1 + rand.nextInt(31);
            String date = year + "-" + month + "-" + day;
            if (dateUtil.isValidDate(date)) {
                System.out.println(date);
            } else {
                //to print invalid dates
                //System.out.println("FALSE   " + date);
                numberOfInvalid++;
            }
        }
        System.out.println("Will be false for years less than 1000");
        System.out.println("Total invalid dates: " + numberOfInvalid);

    }
}































