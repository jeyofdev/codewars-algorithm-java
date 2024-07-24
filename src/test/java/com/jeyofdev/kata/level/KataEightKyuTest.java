package com.jeyofdev.kata.level;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Katas level 8kyu")
public class KataEightKyuTest {
    @Test
    @DisplayName("multiply")
    public void testMultiply() {
        assertEquals(1.0, KataEightKyu.multiply(1.0, 1.0), "1.0 * 1.0 == 1.0");
        assertEquals(2.0, KataEightKyu.multiply(2.0, 1.0), "2.0 * 1.0 == 2.0");
        assertEquals(4.0, KataEightKyu.multiply(2.0, 2.0), "2.0 * 2.0 == 4.0");
        assertEquals(15.0, KataEightKyu.multiply(3.0, 5.0), "3.0 * 5.0 == 15.0");
        assertEquals(0.25, KataEightKyu.multiply(0.5, 0.5), "0.5 * 0.5 == 0.25");
        assertEquals(0.0, KataEightKyu.multiply(5.0, 0.0), "5.0 * 0.0 == 0.0");
        assertEquals(0.0, KataEightKyu.multiply(0.0, 5.0), "0.0 * 5.0 == 0.0");
        assertEquals(0.0, KataEightKyu.multiply(0.0, 0.0), "0.0 * 0.0 == 0.0");
    }

    @Test
    @DisplayName("AbbreviateTwoWords")
    public void testAbbreviateTwoWords() {
        assertEquals("S.H", KataEightKyu.AbbreviateTwoWords("Sam Harris"), "Should return S.H");
        assertEquals("P.F", KataEightKyu.AbbreviateTwoWords("Patrick Feenan"), "Should return P.F");
        assertEquals("E.C", KataEightKyu.AbbreviateTwoWords("Evan Cole"), "Should return E.C");
        assertEquals("P.F", KataEightKyu.AbbreviateTwoWords("P Favuzzi"), "Should return P.F");
        assertEquals("D.M", KataEightKyu.AbbreviateTwoWords("David Mendieta"), "Should return D.M");
    }

    @Test
    @DisplayName("evenOrOdd")
    public void testEvenOrOdd() {
        assertEquals("Odd", KataEightKyu.evenOrOdd(1), "Should return \"Odd\" for num = 1");
        assertEquals("Even", KataEightKyu.evenOrOdd(2), "Should return \"Even\" for num = 2");
        assertEquals("Odd", KataEightKyu.evenOrOdd(-1), "Should return \"Odd\" for num = -1");
        assertEquals("Even", KataEightKyu.evenOrOdd(-2), "Should return \"Even\" for num = -2");
        assertEquals("Even", KataEightKyu.evenOrOdd(0), "Should return \"Even\" for num = 0");
    }
}
