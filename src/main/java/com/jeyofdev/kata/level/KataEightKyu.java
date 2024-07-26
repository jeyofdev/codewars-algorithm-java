package com.jeyofdev.kata.level;

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

}
