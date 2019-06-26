package com.jeonguk.language;

import java.util.stream.IntStream;

public class FunctionalProgramMain {

    public static void main(String[] args) {
        System.out.println(isPrime(10));
    }

    private static boolean isPrime(final int number) {
        return number > 1&&
            IntStream.range(2, number)
            .noneMatch(index -> number % index == 0);
    }

}
