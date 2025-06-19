package com.sparta.nam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SelectionTest {

    @Test
    @DisplayName("Given 64, Return Fail")
    public void giveMarkLessThan65_getGradeIfElse_ReturnsFail(){
        Assertions.assertEquals("Fail", Selection.getGradeIfElse(64));
    }


    @Test
    @DisplayName("Given 65, Return Pass")
    public void giveMarkEqual65_getGradeIfElse_ReturnsPass(){
        Assertions.assertEquals("Pass", Selection.getGradeIfElse(65));
    }

    @Test
    @DisplayName("Given 84, Return Pass")
    public void giveMarkLessThan85_getGradeIfElse_ReturnsPass(){
        Assertions.assertEquals("Pass", Selection.getGradeIfElse(84));
    }

    @Test
    @DisplayName("Given 85, Return Distinction")
    public void giveMarkEqual85_getGradeIfElse_ReturnsDistinction(){
        Assertions.assertEquals("Distinction", Selection.getGradeIfElse(85));
    }

    @Test
    @DisplayName("Given 100, Return Distinction")
    public void giveMarkAbove85_getGradeIfElse_ReturnsDistinction(){
        Assertions.assertEquals("Distinction", Selection.getGradeIfElse(100));
    }

    @Test
    @DisplayName("Given 0, Return Fail")
    public void giveMarkZero_getGradeIfElse_ReturnsFail(){
        Assertions.assertEquals("Fail", Selection.getGradeIfElse(0));
    }

    @ParameterizedTest
    @ValueSource(ints = {65, 84})
    public void givenAMarkBetween65and84_getGradeIfElse_ReturnsPass(int mark)
    {
        Assertions.assertEquals("Pass", Selection.getGradeIfElse(mark));
    }
}
