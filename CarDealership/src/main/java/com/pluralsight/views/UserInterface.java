package com.pluralsight.views;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    public String getCustomerName(){
        System.out.println("Hello");
        System.out.print("What is your name? ");
        String customerName = scanner.nextLine().strip();
        System.out.println();
        return customerName;
    }

    public String answer(String customerName){
        System.out.println(customerName + " Are you looking for a car?");
        System.out.print("Yes/No: ");
        return scanner.nextLine().strip();
    }
}
