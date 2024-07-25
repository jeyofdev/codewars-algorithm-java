package com.jeyofdev.kata.level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/3-jaden_casing_strings.md
     */
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;

        List<String> words = Arrays.asList(phrase.split(" "));
        List<String> updatedWords = words.stream()
                .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase())
                .collect(Collectors.toList());

        return String.join(" ", updatedWords);
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/4-mumbling.md
     */
    public static String accum(String s) {
        List<String> letterList = Arrays.asList(s.split(""));
        List<String> resultList = new ArrayList<>();

        int i = 0;
        for (String letter : letterList) {
            resultList.add(letter.toUpperCase() + letter.toLowerCase().repeat(i));
            i++;
        }

        return String.join("-", resultList);
    }
}
