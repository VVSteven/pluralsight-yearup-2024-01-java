package com.pluralsight;

public class Room {
    private double numOfBeds;

    private double price;

    private boolean occupied;

    private boolean clean;

    private boolean available;

    public Room(double numOfBeds, double price, boolean occupied, boolean clean, boolean available) {
        this.numOfBeds = numOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.clean = clean;
        this.available = available;
    }

    public double getNumOfBeds() {
        return numOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isClean() {
        return clean;
    }

    public boolean isAvailable() {
        return available;
    }
}
