package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SumEvenFiveTests {
    @ParameterizedTest
    @DisplayName("sumEvenFive returns expected result")
    @CsvSource({
            "0, 0",
            "1, 0",
            "9, 25",
            "10, 35",
            "22, 152"
    })
    public void sumEvenFive_ReturnsExpectedResult(int n, int expectedSum) {
        var result = Exercises.sumEvenFive(n);
        Assertions.assertEquals(expectedSum, result);
    }

    @Test
    @DisplayName("Given a parameter of zero, sumEvenFive returns zero")
    public void givenAParameterOfZero_SumEvenFive_ReturnsZero() {
        var result = Exercises.sumEvenFive(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Given a negative number, sumEvenFive returns zero")
    public void givenANegativeParameter_SumEvenFive_ReturnsZero() {
        var result = Exercises.sumEvenFive(-3);
        Assertions.assertEquals(0, result);
    }
}
