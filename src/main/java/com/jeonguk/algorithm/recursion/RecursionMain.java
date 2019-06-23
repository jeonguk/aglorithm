package com.jeonguk.algorithm.recursion;

public class RecursionMain {

    public static void printChars(String str) {
        if (str.length() == 0) {
            return;
        } else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    public static void printCharsReverse(String str) {
        if (str.length() == 0) {
            return;
        } else {
            printChars(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    /**
     * 10진수 -> 2진수로 변환 출력
     * @param n
     */
    public static void printInBinary(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            printInBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    public static int sum(int n, int[] data) {
        if (n <= 0) {
            return 0;
        } else {
            return sum(n - 1, data) + data[n - 1];
        }
    }

    public static void main(String[] args) {
        String givenString = "abcde";

        printChars(givenString);
        System.out.println();
        printCharsReverse(givenString);

        System.out.println();
        printInBinary(10);

        System.out.println();
        int[] givenArray = {1, 2, 3, 4, 5};

        int result = sum(givenArray.length, givenArray);
        System.out.println(result);
    }

}
