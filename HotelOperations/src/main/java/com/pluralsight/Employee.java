package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;


    public Employee(int employeeID, String name, String department, double payRate, float hoursWorked) {
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.name = name;
        this.employeeID = employeeID;
    }

    public double getTotalPay(){
        return getRegularPay() + getOvertimePay();
    }

    public double getRegularPay(){
        return  getRegularHours() * payRate;
    }

    public double getOvertimePay() {
        return getOverTimeHours() * payRate * 1.5;
    }

    public float getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public float getOverTimeHours(){
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

}
