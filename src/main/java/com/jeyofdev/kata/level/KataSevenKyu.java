package com.jeyofdev.kata.level;

import java.math.BigInteger;
import java.util.*;
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

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/12-highest_and_lowest.md
     */
    public static String highAndLow(String numbers) {
        String[] numStrings = numbers.split(" ");

        int[] nums = Arrays.stream(numStrings)
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int min = Arrays.stream(nums).min().orElseThrow();
        int max = Arrays.stream(nums).max().orElseThrow();

        return String.format("%d %d", max, min);
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/13-descending_order.md
     */
    public static int sortDesc(final int num) {
        String[] nums = Integer.toString(num).split("");
        Arrays.sort(nums, Collections.reverseOrder());

        String sortedStr = String.join("", nums);

        return Integer.parseInt(sortedStr);
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/14-list_filtering.md
     */
    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Integer)
                .collect(Collectors.toList());
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/15-isograms.md
     */
    public static boolean  isIsogram(String str) {
        Set<Character> letters = new HashSet<>();

        for (char letter : str.toLowerCase().toCharArray()) {
            if (!letters.add(letter)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/16-number_of_people_in_the_bus.md
     */
    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(e -> e[0] - e [1])
                .sum();
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/17-reverse_words.md
     */
    public static String reverseWords(final String original)
    {
        if (original.trim().isEmpty()) return original;

        return Arrays.stream(original.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/18-odd_or_even.md
     */
    public static String oddOrEven (int[] array) {
        int sum = Arrays.stream(array)
                .reduce(0, (p, c) -> p + c);

        return sum % 2 == 0 ? "even" : "odd";
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/19-string_ends_with.md
     */
    public static boolean stringEndsWith(String str, String ending) {
        return str.endsWith(ending);
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/20-sum_of_array_singles.md
     */
    public static int repeats(int [] arr){
        return Arrays.stream(arr)
                .filter(n -> {
                    long count = Arrays.stream(arr).filter(num -> num == n).count();
                    return count == 1;
                })
                .sum();
    }

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/7kyu/21-shortest_word.md
     */
    public static int findShort(String s) {
        int[] strLength = Arrays.stream(s.split(" "))
                .mapToInt(el -> el.length())
                .toArray();

        Arrays.sort(strLength);
        return strLength.length > 0 ? strLength[0] : -1;
    }
}
