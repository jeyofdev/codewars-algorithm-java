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

    @Test
    @DisplayName("oppositeNumber")
    public void testOppositeNumber() {
        assertEquals(-1, KataEightKyu.oppositeNumber(1), "Should return -1 for num = 1");
        assertEquals(-2, KataEightKyu.oppositeNumber(2), "Should return -2 for num = 2");
        assertEquals(1, KataEightKyu.oppositeNumber(-1), "Should return 1 for num = -1");
    }

    @Test
    @DisplayName("repeatStr")
    public void testRepeatStr() {
        assertEquals("aaaa", KataEightKyu.repeatStr(4, "a"), "Should return aaaa for string \"a\" and repeat 4");;
        assertEquals("HelloHelloHello", KataEightKyu.repeatStr(3, "Hello"), "Should return HelloHelloHello for string = \"Hello\" and repeat 3");
        assertEquals("", KataEightKyu.repeatStr(5, ""), "Should return \"\" for string = \"\" and repeat 5");
        assertEquals("", KataEightKyu.repeatStr(0, "kata"), "Should return \"\" for string = \"kata\" and repeat 0");
    }

    @Test
    @DisplayName("secretMessage")
    public void testSecretMessage() {
        assertEquals("Hello, Jim!", KataEightKyu.secretMessage("Jim"), "should return Hello, Jim! for string \"Jim\"");
        assertEquals("Hello, Jane!", KataEightKyu.secretMessage("Jane"), "should return Hello, Jane! for string \"Jane\"");
        assertEquals("Hello, Simon!", KataEightKyu.secretMessage("Simon"), "should return Hello, Simon! for string \"Simon\"");
        assertEquals("Hello, my love!", KataEightKyu.secretMessage("Johnny"), "should return Hello, my love! for string \"Johnny\"");
    }

    @Test
    @DisplayName("boolToWord")
    public void testBoolToWord() {
        assertEquals("Yes", KataEightKyu.boolToWord(true),"Should return \"Yes\" for true");
        assertEquals("No", KataEightKyu.boolToWord(false),"Should return \"No\" for false");
    }

    @Test
    @DisplayName("removeFirstAndLastChars")
    public void testRemoveFirstAndLastChars() {
        assertEquals("loquen", KataEightKyu.removeFirstAndLastChars("eloquent"), "should return loquen for string \"eloquent\"");
        assertEquals("ountr", KataEightKyu.removeFirstAndLastChars("country"), "should return ountr for string \"country\"");
        assertEquals("erso", KataEightKyu.removeFirstAndLastChars("person"), "should return erso for string \"person\"");
        assertEquals("lac", KataEightKyu.removeFirstAndLastChars("place"), "should return lac for string \"place\"");
    }
}
