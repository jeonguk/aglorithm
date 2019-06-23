package com.jeonguk.algorithm.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionMainTest {

    @Test
    public void givenIntArray_thenSumNumber() {
        int[] givenArray = {1, 2, 3, 4, 5};
        int expected = 15;
        int result = RecursionMain.sum(givenArray.length, givenArray);
        assertEquals(expected, result);
    }

}