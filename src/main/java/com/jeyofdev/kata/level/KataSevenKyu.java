package com.jeyofdev.kata.level;

import java.math.BigInteger;
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

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/5-sum_of_the_first_nth_term_of_series.md
     */
    public static String seriesSum(int n) {
        double sum = 0.00;
        for (int i = 0; i < n; i++) {
            sum += 1.00 / (1 + i * 3);
        }

        return String.format("%.2f", sum);
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/6-folding_your_way_to_the_moon.md
     */
    public static Long fold(Double distance) {
        Long result = 0L;

        if (distance < 0) return null;

        for (double i = 0.0001; i < distance; i*= 2) {
            result += 1;
        }

        return result;
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/7-largest_5_digit_number_in_a_series.md
     */
    public static int getLargestFiveDigitNumber(final String digits) {
        if (digits.length() <= 5) return Integer.parseInt(digits);

        return Math.max(
                Integer.parseInt(digits.substring(0, 5)),
                getLargestFiveDigitNumber(digits.substring(1))
        );
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/8-are_the_numbers_in_order.md
     */
    public static boolean isAscOrder(int[] arr) {
        String arrJoin = Arrays.stream(arr)
                .mapToObj((n) -> String.valueOf(n))
                .collect(Collectors.joining(""));

        int[] sortArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortArr);

        String sorted = Arrays.stream(sortArr)
                .mapToObj((n) -> String.valueOf(n))
                .collect(Collectors.joining(""));

        return arrJoin.equals(sorted);
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/9-breaking_chocolate_problem.md
     */
    public static long breakChocolate(long n, long m) {
        return (n > 0) && (m > 0) ? (n * m) - 1 : 0;
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/10-filter_the_number.md
     */
    public static long filterString(final String value) {
        StringBuilder num = new StringBuilder();

        for (char c : value.toCharArray()) {
            if (Character.isDigit(c)) {
                num.append(c);
            }
        }

        return new BigInteger(num.toString()).longValue();
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/11-split_in_parts.md
     */
    public static String splitInParts(String s, int partLength) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < s.length(); i += partLength) {
            if (i > 0) output.append(' ');
            output.append(s.substring(i, Math.min(s.length(), i + partLength)));
        }

        return output.toString();
    }
}
