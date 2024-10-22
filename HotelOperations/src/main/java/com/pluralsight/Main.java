package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        Employee e1 = new Employee(1, "Taseen", "Tech", 10, 30);
        double totalPay = e1.getTotalPay();
        System.out.println(totalPay);
    }
}