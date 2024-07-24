package com.jeyofdev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testing Application class methods")
public class AppTest
{
    @Test
    @DisplayName("Should return 5 for calcul = 3 + 2")
    public void testApp()
    {
        assertEquals(5, 2 + 3);
    }
}
