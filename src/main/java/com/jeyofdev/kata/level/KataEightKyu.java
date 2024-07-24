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
}
