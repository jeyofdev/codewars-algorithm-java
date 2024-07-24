package com.jeyofdev.kata.level;

public class KataEightKyu {
    public static Double multiply(Double a, Double b) {
        return a * b;
    }

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
}
