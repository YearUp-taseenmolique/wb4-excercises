package com.pluralsight;

import java.util.regex.Pattern;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfRooms = numberOfSuites;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public  Hotel (String name, int numberOfRooms, int numberOfSuites, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfRooms = numberOfSuites;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite){

            if ( numberOfRooms > getAvailableRooms()){
                return false;
            }
            else {
                bookedSuites += numberOfRooms;
                return true;
            }
        }
        else
        {
            if (numberOfRooms > getAvailableRooms() ){
                return false;
            }
            else {
                bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
    }

    public int getAvailableSuite(){
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }
}
