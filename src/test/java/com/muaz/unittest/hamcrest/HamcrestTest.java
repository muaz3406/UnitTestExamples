package com.muaz.unittest.hamcrest;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class HamcrestTest {

    @Test
    public void testCoreMatching() throws Exception{
        String text1="muaz";
        String text2="muaz2";

        assertEquals("muaz",text1);
        assertThat(text1,is(equalTo("muaz")));

        assertThat(text1,is(notNullValue()));
        assertThat(text1,containsString("az"));
        assertThat(text1,anyOf(containsString("mu"),containsString("az")));
    }

    @Test
    public void testLists() throws Exception{
        List<String> cities=new ArrayList<String>(Arrays.asList("newyork","california","ohio"));
        assertThat(cities,hasItem("ohio"));
        assertThat(cities,hasItems("california","newyork"));
        assertThat(cities,allOf(hasItems("california","newyork"),not(hasItem("ankara"))));
        assertThat(cities,either(hasItems("california","newyork")).or(not(hasItem("ankara"))));
    }
}
