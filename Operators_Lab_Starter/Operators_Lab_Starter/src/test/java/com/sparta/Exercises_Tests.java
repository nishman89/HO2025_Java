package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Exercises_Tests {
	// write unit test(s) for myMethod here

   
   @ParameterizedTest
    @ValueSource(ints = {-2, 0, 2, 348})
    @DisplayName("Given an even number, evenOdd returns true")
    public void givenAnEvenNumber_EvenOdd_ReturnsTrue(int x)
    {
        var result = Exercises.evenOdd(x);
        Assertions.assertTrue(result);
    }


    @ParameterizedTest
    @ValueSource(ints = {-3, -1, 1, 347})
    @DisplayName("Given an odd number, evenOdd returns false")
    public void givenAnOddNumber_EvenOdd_ReturnsFalse(int x)
    {
        var result = Exercises.evenOdd(x);
        Assertions.assertFalse(result);
    }

	@ParameterizedTest
    @CsvSource( {"3, 4, 13",
                  "-3, 5, -14",
                  "0, 5, 1"})
    @DisplayName("anotherMethod should return correct result")
    public void anotherMethodTest(int x, int y, int expResult){
        var result = Exercises.anotherMethod(x, y);
        Assertions.assertEquals(expResult, result);
    }


    @ParameterizedTest
    @CsvSource( {"I would like a pony, Doesn't start with H",
            "Help, Starts with H",
            "hello, Starts with H"})
    @DisplayName("StringMethod should return correct result")
    public void stringMethodTest(String phrase, String expResult){
        var result = Exercises.stringMethod(phrase);
        Assertions.assertEquals(expResult, result);
    }

    @Test
    @DisplayName("StringMethod should always return correct result")
    public void stringMethodTest(){
        var result = Exercises.stringMethod(null);
        Assertions.assertEquals("Doesn't start with H", result);
    }
}
