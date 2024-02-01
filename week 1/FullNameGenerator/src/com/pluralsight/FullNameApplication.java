package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] var0) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("============================");

        System.out.print("Enter Your Middle Name: ");
        String middleName = scanner.nextLine();
        System.out.println("============================");

        System.out.print("Enter Your Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("============================");

        System.out.print("Enter Your Suffix: ");
        String suffix = scanner.nextLine();
        System.out.println("============================");
        scanner.close();
//    FRIEND INSPIRED
        String fullName = firstName;

        if (!middleName.isEmpty()){
            fullName += " " + middleName;
        }
        fullName += " " + lastName;

        if (!suffix.isEmpty()){
            fullName += ", " + suffix;
        }
        System.out.println("Full Name: " + fullName);
        System.out.println("============================");

//        FIRST EDITION
//        if (middleName.isEmpty() && suffix.isEmpty() ){
//            System.out.println("Full Name: " + firstName + " " + lastName);
//        } else if(middleName.isEmpty() || suffix.isEmpty()){
//            if (middleName.isEmpty()){
//                System.out.println("Full Name: " + firstName + " " + lastName + " " + suffix);
//            }else {
//                System.out.println("Full Name: " + firstName + " " + middleName + " " + lastName);
//            }
//        }else {
//            System.out.println("Full Name: " + firstName + " " + middleName + " " + lastName + " " + suffix );
//        }
    }
}
