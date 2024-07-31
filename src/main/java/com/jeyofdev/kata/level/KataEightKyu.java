package com.jeyofdev.kata.level;

import java.util.Arrays;

public class KataEightKyu {

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/1-multiply.md
     */
    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/2-abbreviate_a_two_word_name.md
     */
    public static String AbbreviateTwoWords(String name) {
        StringBuilder firstLetters = new StringBuilder();

        for(String n : name.split(" ")) {
            if (firstLetters.length() > 0) {
                firstLetters.append('.');
            }
            firstLetters.append(Character.toUpperCase(n.charAt(0)));
        }

        return firstLetters.toString();
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/3-even_or_odd.md
     */
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/4-opposite_number.md
     */
    public static int oppositeNumber(int number) {
        return -number;
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/5-string_repeat.md
     */
    public static String repeatStr(final int r, final String s) {
        return s.repeat(r);
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/6-jenny_s_secret_message.md
     */
    public static String secretMessage(String name) {
        return name.equals("Johnny") ? "Hello, my love!" : "Hello, " + name + "!";
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/7-convert_boolean_values_to_strings_yes_or_no.md
     */
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/8-remove_first_and_last_character.md
     */
    public static String removeFirstAndLastChars(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/9-keep_hydrated.md
     */
    public static int keepHydrated(double time)  {
        return (int) Math.floor(time * 0.5);
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/10-basic_mathematical_operations.md
     */
    public static Integer basicMath(String op, int v1, int v2)
    {
        switch (op) {
            case "+":
                return v1 + v2;

            case "-":
                return v1 - v2;

            case "*":
                return v1 * v2;

            case "/":
                return v1 / v2;

            default:
                return 0;
        }
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/11-fuel_calculator_total_cost.md
     */
    public static double fuelPrice(int litres, double pricePerLitre) {
        for (int i = 2; i <= 10; i += 2) {
            if (litres >= i) {
                pricePerLitre -= 0.05;
            }
        }

        return (double) Math.round(litres * pricePerLitre * 100) / 100;
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/12-count_of_positives_sum_of_negatives.md
     */
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int count = (int) Arrays.stream(input).filter(n -> n > 0).count();
        int sum = Arrays.stream(input).filter(n -> n < 0).sum();

        return new int[] {count, sum};
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/13-sum_arrays.md
     */
    public static double sumArrays(double[] numbers) {
        if (numbers.length != 0) {
            return Arrays.stream(numbers).reduce(0, (p, c) -> p + c);
        }

        return 0;
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/14-invert_values.md
     */
    public static int[] invertValues(int[] array) {
        return Arrays.stream(array)
                .map(e -> -e)
                .toArray();
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/15-array_plus_array.md
     */
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).reduce(0, (p, c) -> p + c) + Arrays.stream(arr2).reduce(0, (p, c) -> p + c);
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/16-credit_card_mask.md
     */
    public static String creditCardMask(String str) {
        char[] numbers = str.toCharArray();

        for (int i = 0; i < numbers.length - 4; i++) {
            numbers[i] = '#';
        }

        return new String(numbers);
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/17-get_the_mean_of_an_array.md
     */
    public static int getAverage(int[] marks){
        int sum = Arrays.stream(marks).reduce(0, (p, c) -> p + c);
        double avg = (double) sum / marks.length;

        return (int) Math.floor(avg);
    }
}
