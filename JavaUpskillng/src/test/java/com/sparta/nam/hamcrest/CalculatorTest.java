package com.sparta.nam.hamcrest;

import com.sparta.nam.basics.Strings;
import org.hamcrest.*;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class CalculatorTest {



    @Test
    public void give2And6_Add_returns8pt0(){
        Calculator calculator = new Calculator(6,2);
        // Assertions.assertEquals(8.0, calculator.add());
        assertThat(calculator.add(), equalTo(8.0));
    }

    @Test
    void given6And3_DivisibleBy_ReturnsTrue() {
        Calculator calc = new Calculator(6, 2);
        // Assertions.assertTrue(calc.divisibleBy2());
        assertThat(calc.divisibleBy2(), is(true));
    }

    @Test
    void given7And3_DivisibleBy_ReturnsFalse() {
        Calculator calc = new Calculator(7, 3);
        // Assertions.assertFalse(calc.divisibleBy2());
        assertThat(calc.divisibleBy2(), is(false));

    }

    @Test
    void given7And3_ToString_OutputContainsCalculator() {
        Calculator calc = new Calculator(7, 3);
        // Assertions.assertTrue(calc.toString().contains("Calculator"));
        assertThat(calc.toString(), containsString("Calculator"));
        assertThat(calc.toString(), startsWith("Calculator"));
        assertThat(calc.toString(), containsStringIgnoringCase("Calculator"));

    }

    @Test
    void collectionsExercise(){
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("pear");
        fruit.add("banana");
        fruit.add("peach");
        fruit.add("pomegranate");
        fruit.add("pineapple");
        fruit.add("lemon");

        // Assert that with Hamcrest that:
        // THere are 7 elements in the collection
        // The collection contains [banana, pear]
        // It does NOT contain grape
        // The collection does not contain an item that contains the letter z
    }
}
