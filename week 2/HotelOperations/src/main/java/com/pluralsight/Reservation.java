package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numOfNights, boolean weekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numOfNights = numOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        if(roomType.equals("king")){
            price = 139;
        }
        if(roomType.equals("double")){
            price = 124;
        }
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        if(weekend){
            price *= 1.10;
        }
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }
}
