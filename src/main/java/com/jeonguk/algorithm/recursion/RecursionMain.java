package com.jeonguk.algorithm.recursion;

public class RecursionMain {

    public static void printChars(String str) {
        if (str.length() == 0) {
            return;
        }
        System.out.println(str.charAt(0));
        printChars(str.substring(1));
    }

    public static void printCharsReverse(String str) {
        if (str.length() == 0) {
            return;
        }
        printChars(str.substring(1));
        System.out.println(str.charAt(0));
    }

    public static void main(String[] args) {
        String givenString = "abcde";
        printChars(givenString);
        System.out.println();
        printCharsReverse(givenString);
    }

}
