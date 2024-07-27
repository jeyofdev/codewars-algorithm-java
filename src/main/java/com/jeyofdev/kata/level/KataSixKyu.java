package com.jeyofdev.kata.level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
}
