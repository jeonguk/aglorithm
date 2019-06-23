package com.jeonguk.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortMainTest {

    @Test
    public void givenIntegerArray_whenSortedWithQuickSort_thenGetSortedArray() {
        int[] actual = { 9, 5, 1, 0, 6, 2, 3, 4, 7, 8 };
        int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        QuickSortMain.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

}