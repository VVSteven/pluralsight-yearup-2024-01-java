package com.pluralsight;

import com.pluralsight.services.*;

public class Main {
    public static void main(String[] args) {
        CarServices carServices = new CarServices();

        CarDealershipApplication app = new CarDealershipApplication(carServices);
        app.run();
    }
}
