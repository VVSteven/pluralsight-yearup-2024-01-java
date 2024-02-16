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
        dealershipID = ui.displayDealership();
        selectedDealership = switch (dealershipID) {
            case 1 -> "D & B Used Cars";
            case 2 -> "Slick Auto Deals";
            default -> "Invalid Dealership";
        };
        ui.sendToDealership(customerName, selectedDealership);
        startScam();
    }

    public void startScam() {
        int searchFilter = ui.welcomeToDealership(selectedDealership);
        selectedFilter = switch (searchFilter) {
            case 1 -> "Show All";
            case 2 -> "Price Range";
            case 3 -> "Make/Model";
            case 4 -> "Year";
            case 5 -> "Color";
            case 6 -> "Type/Class";
            default -> "Invalid Filter";
        };
        ui.displayFilter(selectedFilter);
        showCars();
    }

    public void showCars() {
        carServices.printCarInformation(dealershipID);
        ui.endScam();
    }
}