package com.jeyofdev.kata.level;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Katas level 6kyu")
public class KataSixKyuTest {
    @Test
    @DisplayName("inArray")
    public void testInArray() {
        String[] a = { "arp", "live", "strong" };
        String[] b = { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] r = { "arp", "live", "strong" };
        assertArrayEquals(r, KataSixKyu.inArray(a, b), "should return [\"arp\", \"live\", \"strong\"] for arrays [\"arp\", \"live\", \"strong\"] and [\"lively\", \"alive\", \"harp\", \"sharp\", \"armstrong\"]");
    }

    @Test
    @DisplayName("digPow")
    public void testDigPow() {
        assertEquals(1, KataSixKyu.digPow(89, 1), "should return 1 for integers 89 and 1");
        assertEquals(-1, KataSixKyu.digPow(92, 1), "should return -1 for integers 92 and 1");
        assertEquals(51, KataSixKyu.digPow(46288, 3), "should return 51 for integers 46288 and 3");
    }

    @Test
    @DisplayName("findOddInt")
    public void testFindOddInt() {
        assertEquals(5, KataSixKyu.findOddInt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}), "should return 5 for array [20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5]");
        assertEquals(-1, KataSixKyu.findOddInt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}), "should return 5 for array [1,1,2,-2,5,2,4,4,-1,-2,5]");
        assertEquals(5, KataSixKyu.findOddInt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}), "should return 5 for array [20,1,1,2,2,3,3,5,5,4,20,4,5]");
        assertEquals(10, KataSixKyu.findOddInt(new int[]{10}), "should return 5 for array [10]");
        assertEquals(10, KataSixKyu.findOddInt(new int[]{1,1,1,1,1,1,10,1,1,1,1}), "should return 5 for array [1,1,1,1,1,1,10,1,1,1,1]");
        assertEquals(1, KataSixKyu.findOddInt(new int[]{5,4,3,2,1,5,4,3,2,10,10}), "should return 5 for array [5,4,3,2,1,5,4,3,2,10,10]");
    }

    @Test
    @DisplayName("encode")
    public void testEncode() {
        assertEquals(")()())()(()()(", KataSixKyu.encode("Prespecialized"), "should return )()())()(()()( for string \"Prespecialized\"");
        assertEquals("))))())))", KataSixKyu.encode("   ()(   "), "should return ))))()))) for string \"   ()(   \"");
    }

    @Test
    @DisplayName("toCamelCase")
    public void testToCamelCase() {
        assertEquals("theStealthWarrior", KataSixKyu.toCamelCase("the_Stealth_Warrior"), "should return theStealthWarrior for string \"the_Stealth_Warrior\"");
        assertEquals("theStealthWarrior", KataSixKyu.toCamelCase("the-Stealth-Warrior"), "should return theStealthWarrior for string \"the-Stealth-Warrior\"");
    }
}