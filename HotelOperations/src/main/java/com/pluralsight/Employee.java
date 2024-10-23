package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;
    private Double punchInTime;


    public Employee(int employeeID, String name, String department, double payRate, float hoursWorked) {
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.name = name;
        this.employeeID = employeeID;
        this.punchInTime = null;
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

    public void punchTimeCard(double time) {
        if (punchInTime == null) {
            // Punching in
            punchInTime = time;
            System.out.println(name + " punched in at " + time);
        } else {
            // Punching out
            punchOut(time);
        }
    }

    public void punchOut(double time) {
        if (punchInTime != null) {
            float workedHours = (float) (time - punchInTime);
            hoursWorked += workedHours; // Add worked hours to total hours worked
            System.out.println(name + " punched out at " + time + ", worked " + workedHours + " hours.");
            punchInTime = null; // Reset punch-in time
        } else {
            System.out.println(name + " cannot punch out without punching in first.");
        }
    }
}
