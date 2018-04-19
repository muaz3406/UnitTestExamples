package com.muaz.unittest.assertj;


import org.junit.Test;

public class LombokTest {

    @Test
    public void testLombok() throws Exception {

        Gift gift=new Gift("muaz");
        System.out.println(gift.toString());



    }
}
