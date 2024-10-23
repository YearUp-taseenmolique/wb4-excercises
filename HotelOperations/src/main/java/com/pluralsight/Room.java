package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public boolean isDirty() {
        return this.dirty;
    }

    public boolean isAvailable() {
        return (!this.isDirty() && !this.isOccupied() );
    }

    public void checkIn() {
        if (isAvailable()) {
            this.occupied = true;
            this.dirty = true;
            System.out.println("Checked in successfully");
        } else {
            System.out.println("Room is not occupied");
        }
    }

    public void checkOut(){
        if (this.isOccupied()){
            this.occupied = false;
            this.dirty = true;
            System.out.println("Checked out successfully. Room needs to be cleaned");
        } else {
            System.out.println("Room is not occupied");
        }
    }

    public void cleanRoom(){
        if (this.isDirty()){
            this.dirty = false;
            System.out.println("Room has been cleaened");
        }else {
            System.out.println("Room is already clean");
        }
    }


}
