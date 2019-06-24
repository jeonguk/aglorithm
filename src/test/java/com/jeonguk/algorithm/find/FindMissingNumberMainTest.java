package com.jeonguk.algorithm.find;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMissingNumberMainTest {

    @Test
    public void givenIntArray_whenMissingNoFind_thenGetMissingNo() {
        int[] givenArr1 = {1, 2, 4, 6, 3, 7, 8};
        int expedted1 = 5;
        int missingNo1 = FindMissingNumberMain.getMissingNo(givenArr1, givenArr1.length);
        assertEquals(expedted1, missingNo1);

        int[] givenArr2 = {1, 2, 3, 5};
        int expected2 = 4;
        int missingNo2 = FindMissingNumberMain.getMissingNo(givenArr2, givenArr2.length);
        assertEquals(expected2, missingNo2);
    }

}