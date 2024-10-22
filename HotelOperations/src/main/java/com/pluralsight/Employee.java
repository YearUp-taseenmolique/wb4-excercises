package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;


    public Employee(String department, float hoursWorked, double payRate, String name, int employeeID) {
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.name = name;
        this.employeeID = employeeID;
    }

    public double getTotalPay(){
        if(hoursWorked > 40){
            float overTimeHours = hoursWorked - 40;
            double regularPay = 40 * payRate;
            double overTimePay = overTimeHours * payRate * 1.5;
            return regularPay + overTimePay;
        }
        else {
            return this.payRate * this.hoursWorked;
        }
    }

    public float getRegularHours(){
        return 0;
    }

    public float getOverTimeHours(){
        return 0;
    }

}
