package com.jeyofdev.kata.level;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Katas level 8kyu")
public class KataFiveKyuTest {
    @Test
    @DisplayName("perimeterOfSquareInRectangle")
    public void testPerimeterOfSquareInRectangle() {
        assertEquals(BigInteger.valueOf(80), KataFiveKyu.perimeterOfSquareInRectangle(BigInteger.valueOf(5)), "Should return 80 for big integer 5");
        assertEquals(BigInteger.valueOf(216), KataFiveKyu.perimeterOfSquareInRectangle(BigInteger.valueOf(7)), "Should return 80 for big integer 5");
        assertEquals(BigInteger.valueOf(14098308), KataFiveKyu.perimeterOfSquareInRectangle(BigInteger.valueOf(30)), "Should return 80 for big integer 5");
    }
}
