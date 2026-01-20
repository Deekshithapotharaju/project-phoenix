package org.example;

public class App {

    public static double calculateInterest(double principal, double rate, int years) {
    // ❌ BUG (again, on purpose)
    return principal * rate;
    }

    public static void main(String[] args) {
        System.out.println("Banking App Running");
    }
}
