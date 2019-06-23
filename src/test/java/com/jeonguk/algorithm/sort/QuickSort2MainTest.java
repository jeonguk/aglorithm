package com.jeonguk.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSort2MainTest {

    @Test
    public void givenIntegerArray_whenSortedWithQuickSort_thenGetSortedArray() {
        int[] actual = { 9, 5, 1, 0, 6, 2, 3, 4, 7, 8 };
        int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        QuickSort2Main.quickSort(actual);
        assertArrayEquals(expected, actual);
    }

}