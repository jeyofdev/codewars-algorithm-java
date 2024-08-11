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

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/18-small_enough_beginner.md
     */
    public static boolean smallEnough(int[] a, int limit)
    {
        return Arrays.stream(a).allMatch(v -> v <= limit);
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/19-sum_of_positive.md
     */
    public static int sumPositive(int[] arr){
        return Arrays.stream(arr)
                .reduce(0, (p, c) -> c >= 0 ? p + c : p);
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/20-return_negative.md
     */
    public static int makeNegative(final int x) {
        return -Math.abs(x);
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/21-grasshopper_summation.md
     */
    public static int summation(int n) {
        int output = 0;

        for (int i = 1; i <= n; i++) {
            output += i;
        }

        return output;
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/22-remove_string_spaces.md
     */
    public static String noSpace(final String x) {
        return x.replaceAll("\\s", "");
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/23-find_the_smallest_integer_in_the_array.md
     */
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/24-convert_a_number_to_a_string.md
     */
    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/25-reversed_strings.md
     */
    public static String reversedStrings(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/26-counting_sheep.md
     */
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int num = 0;

        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep != null && arrayOfSheep) num++;
        }

        return num;
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/27-is_n_divisible_by_x_and_y.md
     */
    public static boolean isDivisible(long n, long x, long y) {
        return (n % x == 0) && (n % y == 0);
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/28-quare_Sum.md
     */
    public static int squareSum(int[] n)
    {
        return Arrays.stream(n)
                .map(e -> e * e)
                .sum();
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/29-count_by_x.md
     */
    public static int[] countBy(int x, int n){
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = (i + 1) * x;
        }

        return result;
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/30-convert_number_to_reversed_array_of_digits.md
     */
    public static int[] digitize(long n) {
        String[] digits = new StringBuilder(Long.toString(n))
                .reverse()
                .toString()
                .split("");

        return Arrays.stream(digits).
                mapToInt(el -> Integer.parseInt(el))
                .toArray();
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/31-beginner_reduce_but_grow.md
     */
    public static int grow(int[] x){
        return Arrays.stream(x).reduce(1, (p, c) -> p * c);
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/32-total_amount_of_points.md
     */
    public static int points(String[] games) {
        int points = 0;

        for (String game : games) {
            String[] split = game.split(":");

            int score1 = Integer.parseInt(split[0]);
            int score2 = Integer.parseInt(split[1]);

            if (score1 > score2) points += 3;
            else if (score1 == score2) points += 1;
        }

        return points;
    }

    /**
     * Instruction : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/8kyu/33-remove_the_time.md
     */
    public static String shortenToDate(String longDate) {
        return longDate.split(",")[0].trim();
    }
}
