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
        switch (searchFilter) {
            case 1:
                selectedFilter = "Show All";
                showAllCars();
                break;
            case 2:
                selectedFilter = "Price";
                showCarsByRange();
                break;
            case 3:
                selectedFilter = "Make/Model";
                showFilterCars();

                break;
            case 4:
                selectedFilter = "Year";
                showFilterCars();

                break;
            case 5:
                selectedFilter = "Color";
                showFilterCars();

                break;
            case 6:
                selectedFilter = "Type/Class";
                showFilterCars();
                break;
            case 7:
                addCar();
                break;
            case 8:
                removeCar();
                break;
            case 9:
                exitDealership();
                break;
            default:
                selectedFilter = "Invalid Filter";
                break;
        }
    }


    public void showAllCars() {
        carServices.displayCarInformation(dealershipID);
        ui.endScam();
    }

    public void showCarsByRange() {
        double minPrice = ui.getPriceRangeMin();
        double maxPrice = ui.getPriceRangeMax();
        ui.displayCarsByRange(dealershipID,minPrice,maxPrice);
        ui.endScam();
    }
    public void showFilterCars(){

    }

    public void addCar() {

    }
    public void exitDealership() {

    }
    public void removeCar(){

    }
}