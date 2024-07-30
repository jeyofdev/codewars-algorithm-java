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

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/6kyu/8-consecutive_strings.md
     */
    public static String longestConsec(String[] arr, int k) {
        int arrLength = arr.length;

        if ((k > arrLength) || (k <= 0)) {
            return "";
        }

        String output = "";
        String currentStr = "";

        for (int i = 0; i <= arrLength - k; i++) {
            currentStr = String.join("", Arrays.copyOfRange(arr, i , i + k));
            if (currentStr.length() > output.length()) {
                output = currentStr;
            }
        }

        return output;
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/6kyu/9-persistent_bugger.md
     */
    public static int persistence(long n) {
        int count = 0;

        while (n > 9) {
            long product = 1;

            while(n != 0) {
                product *= n % 10;
                n /= 10;
            }

            n = product;
            count++;
        }

        return count;
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/6kyu/10-rectangle_into_squares.md
     */
    public static List<Integer> squareInRectangle(int lng, int wdth) {
        if (lng == wdth) return null;

        List<Integer> output = new ArrayList<>();

        while(lng > 0 && wdth > 0) {
            if (lng > wdth) {
                output.add(wdth);
                lng -= wdth;
            }
            else {
                output.add(lng);
                wdth -= lng;
            }
        }

        return output;
    }
}
