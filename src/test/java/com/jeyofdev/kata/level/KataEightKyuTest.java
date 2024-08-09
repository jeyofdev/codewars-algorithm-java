package com.jeyofdev.kata.level;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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

    private void runTest(int[] expected, int[] input) {
        assertArrayEquals(expected, KataEightKyu.invertValues(input), () -> String.format("Input: %s", Arrays.toString(input)));
    }

    @Test
    @DisplayName("invertValues")
    public void testInvertValues() {
        runTest(new int[]{-1, -2, -3, -4, -5}, new int[]{1, 2, 3, 4, 5});
        runTest(new int[]{-1, 2, -3, 4, -5}, new int[]{1, -2, 3, -4, 5});
        runTest(new int[]{1, 2, 3, 4, 5}, new int[]{-1, -2, -3, -4, -5});
        runTest(new int[]{}, new int[]{});
        runTest(new int[]{0}, new int[]{0});
    }

    @Test
    @DisplayName("arrayPlusArray")
    public void testArrayPlusArray() {
        assertEquals(21, KataEightKyu.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, KataEightKyu.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, KataEightKyu.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, KataEightKyu.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }

    @Test
    @DisplayName("creditCardMask")
    public void testCreditCardMask() {
        assertEquals("############5616", KataEightKyu.creditCardMask("4556364607935616"), "\"Should return ############5616 for string \"4556364607935616\"");
        assertEquals("#######5616", KataEightKyu.creditCardMask("64607935616"), "\"Should return #######5616 for string \"64607935616\"");
        assertEquals("1", KataEightKyu.creditCardMask("1"), "\"Should return 1 for string \"1\"");
        assertEquals("", KataEightKyu.creditCardMask(""), "\"Should return \"\" for string \"\"");

        // "What was the name of your first pet?"
        assertEquals("##ippy", KataEightKyu.creditCardMask("Skippy"), "Should return ##ippy for string \"Skippy\"");
        assertEquals("####################################man!", KataEightKyu.creditCardMask("Nananananananananananananananana Batman!"), "Should return ####################################man! for string \"Nananananananananananananananana Batman!\"");
        assertEquals(2100, KataEightKyu.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }

    @Test
    @DisplayName("getAverage")
    public void testGetAverage() {
        assertEquals(2, KataEightKyu.getAverage(new int[] {2,2,2,2}));
        assertEquals(3, KataEightKyu.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1, KataEightKyu.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }

    @Test
    @DisplayName("smallEnough")
    public void testSmallEnough() {
        assertTrue(KataEightKyu.smallEnough(new int[]{66, 101}, 200));
        assertFalse(KataEightKyu.smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100));
        assertTrue(KataEightKyu.smallEnough(new int[] { 101, 45, 75, 105, 99, 107 }, 107));
        assertTrue(KataEightKyu.smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));
    }

    @Test
    @DisplayName("sumPositive")
    public void testSumPositive() {
        assertEquals(15, KataEightKyu.sumPositive(new int[]{1,2,3,4,5}), "Should return 15 for array [1,2,3,4,5]");
        assertEquals(13, KataEightKyu.sumPositive(new int[]{1,-2,3,4,5}), "Should return 13 for array [1,-2,3,4,5]");
        assertEquals(0, KataEightKyu.sumPositive(new int[]{}), "Should return 0 for array []");
        assertEquals(0, KataEightKyu.sumPositive(new int[]{-1,-2,-3,-4,-5}), "Should return 0 for array [-1,-2,-3,-4,-5]");
        assertEquals(9, KataEightKyu.sumPositive(new int[]{-1,2,3,4,-5}), "Should return 9 for array [-1,2,3,4,-5]");
    }

    @Test
    @DisplayName("makeNegative")
    public void testMakeNegative() {
        assertEquals(-42, KataEightKyu.makeNegative(42), "Should return -42 for integer 42");
    }

    @Test
    @DisplayName("summation")
    public void testSummation() {
        assertEquals(1, KataEightKyu.summation(1), "Should return 1 for integer 1");
        assertEquals(36, KataEightKyu.summation(8), "Should return 36 for integer 8");
    }

    @Test
    @DisplayName("noSpace")
    public void testNoSpace() {
        assertEquals("8j8mBliB8gimjB8B8jlB", KataEightKyu.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", KataEightKyu.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", KataEightKyu.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", KataEightKyu.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", KataEightKyu.noSpace("8j aam"));
    }

    @Test
    @DisplayName("findSmallestInt")
    public void testFindSmallestInt() {
        assertEquals(11, KataEightKyu.findSmallestInt(new int[]{78,56,232,12,11,43}));
        assertEquals(-33, KataEightKyu.findSmallestInt(new int[]{78,56,-2,12,8,-33}));
        assertEquals(Integer.MIN_VALUE, KataEightKyu.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE}));
    }

    @Test
    @DisplayName("numberToString")
    public void testNumberToString() {
        assertEquals("67", KataEightKyu.numberToString(67));
        assertEquals("123", KataEightKyu.numberToString(123));
        assertEquals("999", KataEightKyu.numberToString(999));
    }

    @Test
    @DisplayName("reversedStrings")
    public void testReversedStrings() {
        assertEquals("dlrow", KataEightKyu.reversedStrings("world"), "Should return dlrow for string \"world\"");
    }

    @Test
    @DisplayName("countSheeps")
    public void testCountSheeps() {
        Boolean[] array1 = {
                true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true
        };
        assertEquals(17, KataEightKyu.countSheeps(array1), "Should return 17");
    }
}
