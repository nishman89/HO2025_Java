package com.sparta.nam.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Film Classifications Tests")
public class FilmClassificationTests {
    @Test
    @DisplayName("Age under 12 should return 'U & PG films are available.'")
    void testUnder12() {
        Assertions.assertEquals("U & PG films are available.", FilmClassification.getClassificationsByAge(11));
        Assertions.assertEquals("U & PG films are available.", FilmClassification.getClassificationsByAge(0));
    }

    @Test
    @DisplayName("Age 12 should return 'U, PG & 12 films are available.'")
    void testExactly12() {
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassification.getClassificationsByAge(12));
    }

    @Test
    @DisplayName("Ages 13–14 should return 'U, PG & 12 films are available.'")
    void testBetween12And14() {
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassification.getClassificationsByAge(13));
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassification.getClassificationsByAge(14));
    }

    @Test
    @DisplayName("Age 15 should return 'U, PG, 12 & 15 films are available.'")
    void testExactly15() {
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassification.getClassificationsByAge(15));
    }

    @Test
    @DisplayName("Ages 16–17 should return 'U, PG, 12 & 15 films are available.'")
    void testBetween15And17() {
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassification.getClassificationsByAge(16));
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassification.getClassificationsByAge(17));
    }

    @Test
    @DisplayName("Age 18+ should return 'All films are available.'")
    void test18AndAbove() {
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(18));
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(30));
    }

    @ParameterizedTest
    @ValueSource(ints = {20,21,22,23,25,90})
    @DisplayName("Parametierzed tests")
    void example(int input) {
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(input));
    }
}
