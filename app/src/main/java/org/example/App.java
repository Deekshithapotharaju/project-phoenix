package org.example;

public class App {

    public static double calculateInterest(double principal, double rate, int years) {
        // ❌ BUG: incorrect formula
        return principal * rate;  // years missing
    }

    public static void main(String[] args) {
        System.out.println("Banking App Running");
    }
}
