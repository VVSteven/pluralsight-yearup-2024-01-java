package com.pluralsight;

import java.util.Scanner;

import com.pluralsight.services.*;
import com.pluralsight.views.UserInterface;


public class CarDealershipApplication {
    private Scanner scanner;
    UserInterface ui = new UserInterface();

    private String customerName;
    private String selectedDealership;
    private int dealershipID;
    private int searchFilter;
    private String selectedFilter;
    CarServices carServices;

    public CarDealershipApplication(CarServices carServices) {
        this.carServices = carServices;
    }


    public void run() {

        scanner = new Scanner(System.in);
        customerName = ui.getCustomerName();

        while (true) {
            String answer = ui.answer(customerName);
            if (answer.equalsIgnoreCase("No")) {
                System.out.println(customerName + " why are you here.");
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
        System.out.println(customerName + " you are now being sent to the " + selectedDealership + " Dealership");
        System.out.println();
        dealership();
    }

    public void dealership() {
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
        searchFilter = scanner.nextInt();
        selectedFilter = switch (searchFilter) {
            case 1 -> "Show All";
            case 2 -> "Price Range";
            case 3 -> "Make/Model";
            case 4 -> "Year";
            case 5 -> "Color";
            case 6 -> "Type/Class";
            default -> "Invalid Filter";
        };
        System.out.println("Cars by sorted by " + selectedFilter);
        showCars();
    }

    public void showCars() {
        System.out.println();
        carServices.printCarInformation();
    }
}