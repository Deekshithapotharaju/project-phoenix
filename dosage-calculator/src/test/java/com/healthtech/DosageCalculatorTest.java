package com.healthtech;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DosageCalculatorTest {

    @Test
    public void testDosageCalculation() {
        double weight = 50.0;
        double expectedDosage = 500.0;

        double actualDosage = DosageCalculator.calculateDosage(weight);

        assertEquals(expectedDosage, actualDosage, 0.001);
    }
}
