package com.jeonguk.algorithm.find;

public class FindMissingNumberMain {

    public static int getMissingNo(int[] arr, int n) {
        int total = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            total -= arr[i];
        }
        return total;
    }

}
