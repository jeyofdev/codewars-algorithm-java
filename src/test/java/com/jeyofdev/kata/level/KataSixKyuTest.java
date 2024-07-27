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
}