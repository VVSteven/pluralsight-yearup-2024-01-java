package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzeriaApplication {
    public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to Papa's Pizzeria");
        System.out.println("=================================");
        System.out.println();

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().strip();
        System.out.println("=================================");

        System.out.println("Menu");
        System.out.println("=================================");
        System.out.println("Pizza Sizes");
        System.out.println("(S)mall - $5.99");
        System.out.println("(M)edium - $8.99");
        System.out.println("(L)arge - $11.99");

        System.out.print("Please enter the size of your desired pizza: ");
        String size = scanner.nextLine().strip();
        System.out.println("=================================");

        System.out.println("Cheeses");
        System.out.println("(1) Mozzarella");
        System.out.println("(2) Cheddar");
        System.out.println("(3) Parmesan");
        System.out.println("(4) Cheddar");

        System.out.print("Please enter the cheese you want: ");
        String cheese = scanner.nextLine().strip();
        System.out.println("=================================");

        //Toppings
        ArrayList<String> toppings = new ArrayList<>();

        System.out.println("Toppings");
        System.out.println("(1) Pepperoni");
        System.out.println("(2) Mushrooms");
        System.out.println("(3) Onions");
        System.out.println("(4) Sausage");
        System.out.println("(5) Green Peppers");
        System.out.println("(6) Black Olives");
        System.out.println("(7) Bacon");
        System.out.println("(8) Ham");
        System.out.println("(9) Pineapple");
        System.out.println("(10) Spinach");
        System.out.println("(11) Extra Cheese");
        System.out.println("(12) Jalapenos");
        System.out.println("(13) Anchovies");

        System.out.print("Do you want to add toppings (y/n): ");
        String addToppings = scanner.nextLine().strip();

        if(addToppings.equalsIgnoreCase("y")){
            System.out.print("What Toppings");
        }
        System.out.println("=================================");

        // Additional functionality for selecting pizza size, cheeses, and toppings can be added here
    }
}
