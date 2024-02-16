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
    public int displayDealership(){
        System.out.println("Dealerships:");
        System.out.println("========================");
        System.out.println("(1) D & B Used Cars 111 Old Benbrook Rd, Dallas, TX, 45137");
        System.out.println("(2) Slick Auto Deals 123 Main, SLC, UT, 84111");
        System.out.print("Select A Dealership: ");
        return scanner.nextInt();
    }
    public void sendToDealership(String customerName,String selectedDealership){
        System.out.println();
        System.out.println(customerName + " you are now being sent to the " + selectedDealership + " Dealership");
        System.out.println();
    }
    public int welcomeToDealership(String selectedDealership){
        System.out.println("Welcome to " + selectedDealership);
        System.out.println("========================");
        System.out.println();
        System.out.println("How do you want to search for your new car?");
        System.out.println("(1) Show All");
        System.out.println("(2) Price Range");
        System.out.println("(3) Make/Model");
        System.out.println("(4) Year");
        System.out.println("(5) Color");
        System.out.println("(6) Type/Class");
        System.out.print("");
         return scanner.nextInt();

    }
    public void displayFilter(String selectedFilter){
        System.out.println("Cars by sorted by " + selectedFilter);
    }
}
