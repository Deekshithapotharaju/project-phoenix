package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void interestCalculationShouldBeCorrect() {
        double principal = 1000.0;
        double rate = 0.05; // 5%
        int years = 1;

        double interest = App.calculateInterest(principal, rate, years);

        assertEquals(50.0, interest);
    }
}
