package com.jeyofdev.kata.level;

import java.util.*;
import java.util.stream.Collectors;

public class KataSixKyu {

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/6kyu/1-which_are_in.md
     */
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> arr1 = Arrays.asList(array1);
        List<String> arr2 = Arrays.asList(array2);

        String words = String.join(" ", arr2);

        return arr1.stream()
                .filter((str -> words.contains(str)))
                .sorted().toArray(String[]::new);
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/6kyu/2-playing_with_digits.md
     */
    public static long digPow(int n, int p) {
        int sum = 0;
        String str = String.valueOf(n);

        for (int i  = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            sum += (int) Math.pow(digit, p + i);
        }

        return sum % n == 0 ? sum / n : -1;
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/6kyu/3-find_the_odd_int.md
     */
    public static int findOddInt(int[] a) {
        Map<Integer, Integer> countNumbs = new HashMap<>();

        for (int number : a) {
            countNumbs.put(number, countNumbs.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countNumbs.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }

        return -1;
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/6kyu/4-duplicate_encoder.md
     */
    public static String encode(String word){
        StringBuilder result = new StringBuilder();

        char[] charArr = word.toLowerCase().toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : charArr) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : charArr) {
            result.append(charCount.get(c) > 1 ? ")" : "(");
        }

        return result.toString();
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/6kyu/5-convert_string_to_camel_case.md
     */
    public static String toCamelCase(String s){
        String result = "";
        String[] words = s.replaceAll("[-_]", " ").split(" ");

        for (int i = 0; i < words.length; i++) {
            result += i == 0 ? words[i] : words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        return String.join("", result);
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/6kyu/6-count_the_smiley_faces.md
     */
    public static int countSmileys(List<String> arr) {
        int result = 0;
        List<String> valid = Arrays.asList(":)",";)",":-)",";-)",";~)",":~)",":D",";D",":-D",":~D",";-D",";~D");

        for (String smiley : arr) {
            result += valid.contains(smiley) ? 1 : 0;
        }

        return result;
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/6kyu/7-are_they_the_same.md
     */
    public static boolean areTheSame(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }

        int[] squareValues = Arrays.stream(a).map(e -> e * e).toArray();

        Arrays.sort(squareValues);
        Arrays.sort(b);

        return Arrays.equals(squareValues, b);
    }
}
