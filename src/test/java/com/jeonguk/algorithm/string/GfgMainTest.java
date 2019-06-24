package com.jeonguk.algorithm.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class GfgMainTest {

    @Test
    public void givenTwoString_whenInclude_thenRemoveTest() {
        String givenStr1 = "geeksforgeeks";
        String givenStr2 = "mask";
        String expected = "geeforgee";
        String result = GfgMain.gfg(givenStr1, givenStr2);
        assertEquals(expected, result);
    }

}