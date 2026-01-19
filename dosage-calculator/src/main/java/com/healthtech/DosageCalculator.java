package com.healthtech;

public class DosageCalculator {

    // Calculates dosage based on weight (mg per kg)
    public static double calculateDosage(double weightKg) {
        return weightKg * 10;
    }
}
