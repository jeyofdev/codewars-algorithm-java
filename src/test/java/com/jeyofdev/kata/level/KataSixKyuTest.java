package com.jeyofdev.kata.level;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Katas level 7kyu")
public class KataSixKyuTest {
    @Test
    @DisplayName("inArray")
    public void testInArray() {
        String[] a = { "arp", "live", "strong" };
        String[] b = { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] r = { "arp", "live", "strong" };
        assertArrayEquals(r, KataSixKyu.inArray(a, b), "should return [\"arp\", \"live\", \"strong\"] for arrays [\"arp\", \"live\", \"strong\"] and [\"lively\", \"alive\", \"harp\", \"sharp\", \"armstrong\"]");
    }
}