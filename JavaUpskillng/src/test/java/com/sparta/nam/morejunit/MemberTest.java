package com.sparta.nam.morejunit;

import com.sparta.nam.oop.Member;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;

import java.time.LocalDate;

public class MemberTest {

    // FIRST - charactersitics of good unit tests
    // F - Fast
    // I - Indepedent
    // R - Repeatable
    // S - Self checking
    // T - Timely

    // @BeforeAll - methods with this annotation will run before all your tests (run once and then all tests then run)
    // @AfterAll - your tests will run, THEN the method with @AfterAll annotation will then run
    // @BeforeEach - methods with this attribute will run before EACH test method
    // @AfterEach - methods wtih this attribute will run AFTER each test method
    private Member sut;
    @BeforeEach
    public void setUp(){
        //Arrange
        var today = LocalDate.now();
        var joinDate = today.minusDays(4);
        sut = new Member("Nish", "Mandal", joinDate.getYear(), joinDate.getMonth().getValue(), joinDate.getDayOfMonth());
    }

    @Test
    @DisplayName("getMemberDays return the correct number of days since joining")
    // @Disabled("Bad")
    public void getMemberDaysTest(){

        // Act (call the method under tests)
        var result = sut.getMemberDays();
        // Assert
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("toString returns correct info")
    public void toStringTest(){
        // Act
        var result = sut.toString();
        //Assert
        Assertions.assertEquals("Nish Mandal has been a member for 4 days.", result);
    }



}
