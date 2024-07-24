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
}
