package com.jeyofdev.kata.level;

import java.util.Arrays;
import java.util.List;

public class KataSevenKyu {

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/1-owel_count.md
     */
    public static int vowelCount(String str) {
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

        return (int) str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> vowels.contains(String.valueOf(c)))
                .count();
    }
}
