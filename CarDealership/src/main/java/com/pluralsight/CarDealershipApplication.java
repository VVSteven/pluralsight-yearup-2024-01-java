package com.pluralsight;

import java.util.Scanner;

public class CarDealershipApplication {
    private Scanner scanner;
    private String userName;
    private String selectedDealership;
    private int dealershipID;

    public void run() {

        scanner = new Scanner(System.in);

        System.out.println("Hello");

        while (true) {
            System.out.print("What is your name? ");
            userName = scanner.nextLine().strip();

            System.out.println(userName + " Are you looking for a car?");
            System.out.print("Yes/No: ");
            String customer = scanner.nextLine().strip();
            if (customer.equalsIgnoreCase("No")) {
                System.out.println(userName + " why are you here.");
                break;
            }
            showDealerships();
        }
    }

    public void showDealerships() {
        System.out.println("Dealerships:");
        System.out.println("========================");
        System.out.println("(1) D & B Used Cars 111 Old Benbrook Rd, Dallas, TX, 45137");
        System.out.println("(2) Slick Auto Deals 123 Main, SLC, UT, 84111");
        System.out.print("Select A Dealership: ");
        dealershipID = scanner.nextInt();
        selectedDealership = switch (dealershipID) {
            case 1 -> "D & B Used Cars";
            case 2 -> "Slick Auto Deals";
            default -> "Invalid Dealership";
        };
        System.out.println();
        System.out.println( userName + " you are now being sent to the " + selectedDealership + " Dealership");
        System.out.println();
       dealership();
    }
    public void dealership(){
        System.out.println("Welcome to " + selectedDealership);
        System.out.println("========================");
        System.out.println();


    }
}