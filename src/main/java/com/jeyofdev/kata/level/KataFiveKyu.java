package com.jeyofdev.kata.level;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class KataFiveKyu {

    /**
     * Instructions : https://github.com/jeyofdev/codewars-algorithm-java/blob/main/doc/5kyu/1-perimeter_of_squares_in_a_rectangle.md
     */
    public static BigInteger perimeterOfSquareInRectangle(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) return BigInteger.valueOf(4);

        List<BigInteger> output = new ArrayList<>();
        output.add(BigInteger.ONE);
        output.add(BigInteger.ONE);

        for (int i = 2; i <= n.intValue(); i++) {
            BigInteger item = output.get(output.size() - 1).add(output.get(output.size() - 2));
            output.add(item);
        }

        return (output.stream().reduce(BigInteger.ZERO, BigInteger::add)).multiply(BigInteger.valueOf(4));
    }
}
