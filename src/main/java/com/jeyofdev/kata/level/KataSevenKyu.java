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

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/2-get_the_middle_character.md
     */
    public static String getMiddleCharacter(String word) {
        int count = word.length();
        double middle = count / 2.0;
        int begin = (count % 2 == 0) ? (int) (middle - 1) : (int) (middle - 0.5);
        int end = (int) middle + 1;

        return word.substring(begin, end);
    }
}
