package com.jeonguk.algorithm.gcd;

import org.junit.Test;

import static org.junit.Assert.*;

public class GcdMainTest {

    @Test
    public void givenTwoNumbers_whenEuclid_thenGcdNumber() {
        int actual = GcdMain.gcd(192, 72);
        int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    public void givenTwoNumbers_whenBigIntegerMethod_thenGcdNumber() {
        int actual = GcdMain.bigIntegerGcd(192, 72);
        int expected = 24;
        assertEquals(expected, actual);
    }

}