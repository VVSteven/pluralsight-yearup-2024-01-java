package com.pluralsight;

public class BankApplication {
    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount("12345", 25);
        System.out.println(bankAccount.getAccountName());
        System.out.println(bankAccount.getBalance());

//        System.out.println();
//        System.out.println("withdraw 100 dollars");
//        double balance = bankAccount.withdraw(100);
//        System.out.println(balance + " should equal " + bankAccount.getBalance());

        System.out.println();
        System.out.println("deposit 100 dollars");
        double addMoney = bankAccount.deposit(100);
        System.out.println(addMoney + " should equal " + bankAccount.getBalance());

    }
}
