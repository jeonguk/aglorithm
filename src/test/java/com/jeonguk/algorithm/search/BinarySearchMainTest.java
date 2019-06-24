package com.jeonguk.algorithm.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchMainTest {

    @Test
    public void givenInfiniteIntegerArray_whenBinarySearch_thenTargetIndexExistsTest() {
        int[] givenArray = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int expected = 6;
        int ans = BinarySearchMain.binarySearch(givenArray,0, givenArray.length - 1, 100);
        assertEquals(expected, ans);
    }

    @Test
    public void givenInfiniteIntegerArray_whenFindPos_thenTargetIndexExistsTest() {
        int[] givenArray = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int expected = 4;
        int ans = BinarySearchMain.findPos(givenArray,10);
        assertEquals(expected, ans);
    }

    @Test
    public void givenInfiniteIntegerArray_whenFindPos_thenTargetIndexNotExistsTest() {
        int[] givenArray = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int expected = -1;
        int ans = BinarySearchMain.findPos(givenArray,15);
        assertEquals(expected, ans);
    }

}