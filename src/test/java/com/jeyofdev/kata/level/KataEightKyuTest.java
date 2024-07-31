package com.jeyofdev.kata.level;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
        assertEquals("Odd", KataEightKyu.evenOrOdd(1), "Should return \"Odd\" for int = 1");
        assertEquals("Even", KataEightKyu.evenOrOdd(2), "Should return \"Even\" for int = 2");
        assertEquals("Odd", KataEightKyu.evenOrOdd(-1), "Should return \"Odd\" for int = -1");
        assertEquals("Even", KataEightKyu.evenOrOdd(-2), "Should return \"Even\" for int = -2");
        assertEquals("Even", KataEightKyu.evenOrOdd(0), "Should return \"Even\" for int = 0");
    }

    @Test
    @DisplayName("oppositeNumber")
    public void testOppositeNumber() {
        assertEquals(-1, KataEightKyu.oppositeNumber(1), "Should return -1 for int = 1");
        assertEquals(-2, KataEightKyu.oppositeNumber(2), "Should return -2 for int = 2");
        assertEquals(1, KataEightKyu.oppositeNumber(-1), "Should return 1 for int = -1");
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

    @Test
    @DisplayName("keepHydrated")
    public void testKeepHydrated() {
        assertEquals(1, KataEightKyu.keepHydrated(2), "Should return 1 for int 2");
        assertEquals(0, KataEightKyu.keepHydrated(0.97), "Should return 0 for int 0.97");
        assertEquals(7, KataEightKyu.keepHydrated(14.64),"Should return 7 for int 14.64");
        assertEquals(800, KataEightKyu.keepHydrated(1600.20),"Should return 800 for int 1600.20");
        assertEquals(40, KataEightKyu.keepHydrated(80),"Should return 40 for int 80");
    }

    @Test
    @DisplayName("basicMath")
    public void testBasicMath() {
        assertEquals(11, KataEightKyu.basicMath("+", 4, 7), "Should return 11 for operation 4 + 7");
        assertEquals(-3, KataEightKyu.basicMath("-", 15, 18), "Should return -3 for operation 15 - 18");
        assertEquals(25, KataEightKyu.basicMath("*", 5, 5), "Should return 25 for operation 5 * 5");
        assertEquals(7, KataEightKyu.basicMath("/", 49, 7),"Should return 7 for operation 49 / 7");
    }

    @Test
    @DisplayName("fuelPrice")
    public void testFuelPrice() {
        assertEquals(5.65d, KataEightKyu.fuelPrice(5, 1.23d), "Should return 5.65d for 5 litres and 1.23d price per litre");
        assertEquals(18.40d, KataEightKyu.fuelPrice(8, 2.5d), "Should return 18.40d for 8 litres and 2.5d price per litre");
        assertEquals(27.50d, KataEightKyu.fuelPrice(5, 5.6d),  "Should return 27.50d for 5 litres and 5.6d price per litre");
    }

    @Test
    @DisplayName("countPositivesSumNegatives")
    public void testCountPositivesSumNegatives() {
        int[] expectedResultA = new int[] {10, -65};

        assertArrayEquals(expectedResultA, KataEightKyu.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));

        int[] expectedResultB = new int[] {8, -50};
        assertArrayEquals(expectedResultB, KataEightKyu.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }

    @Test
    @DisplayName("sumArrays")
    public void testSumArrays() {
        assertEquals(0, KataEightKyu.sumArrays(new double[] { }));
        assertEquals(-2.398, KataEightKyu.sumArrays(new double[] {-2.398}));
        assertEquals(6, KataEightKyu.sumArrays(new double[] {1, 2, 3}));
        assertEquals(6.6, KataEightKyu.sumArrays(new double[] {1.1, 2.2, 3.3}));
        assertEquals(9.2, KataEightKyu.sumArrays(new double[] {1, 5.2, 4, 0, -1}));
        assertEquals(320, KataEightKyu.sumArrays(new double[] {30, 89, 100, 101}));

    }
}
