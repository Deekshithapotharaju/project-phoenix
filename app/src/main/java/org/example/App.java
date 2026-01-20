package org.example;

public class App {

    public static double calculateInterest(double principal, double rate, int years) {
    // ❌ WRONG ON PURPOSE
    return principal * rate * years * 2;
}


    public static void main(String[] args) {
        System.out.println("Banking App Running");
    }
}
