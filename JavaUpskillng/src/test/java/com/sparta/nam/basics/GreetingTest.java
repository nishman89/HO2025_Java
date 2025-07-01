package com.sparta.nam.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {

    @Test
    @DisplayName("My first test")
    public void firstTest(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Greeting returns good evening with input of 21")
    public void greeting_ReturnsGoodEvening_input21(){
        // Arrange
        int time = 21;
        String expected = "Good evening!";
        // Act - call method under test
        String actual = Main.greeting(time);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("ExceptionTests")
    public void greeting_throwsException_invalidInput(){
        // Arrange
        int time = -1;
        // Act - call method under test
        // Assert
        var exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> Main.greeting(time));
        Assertions.assertEquals("Must be 0-23", exception.getMessage());
    }
}
