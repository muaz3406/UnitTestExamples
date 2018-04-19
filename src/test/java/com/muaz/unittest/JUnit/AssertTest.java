package com.muaz.unittest.JUnit;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by muazt on 31.01.2018.
 */
public class AssertTest {
    @Test
    public void testAssortions()throws Exception{

       // Dummy D1=new Dummy(5);
        //Dummy D2=new Dummy(10);
        // assertEquals(D1,D2);
        //assertSame(D1,D2);
        //assertNull(D1);
    String[] arr1=new String[]{"1","2"};
    String[] arr2=new String[]{"2","1"};

    assertArrayEquals(arr1,arr2);
    }

    private static class Dummy{
        private int id;

        public Dummy(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        //@Override
        //public boolean equals(Objects obj){
        //return this.id==((Dummy)obj).getId();
        //}
    }
}
