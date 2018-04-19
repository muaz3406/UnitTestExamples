package com.muaz.unittest.calculator;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
GIVEN-WHEN-THEN
 */

public class CalculatorTest3 {

    @Test
    public void testSUM(){

        //GIVEN
        Calculator calculator=new Calculator();
        int num1=3;
        int num2=1;

        //WHEN
        int sum=calculator.summation(num1,num2);

        //THEN
        Assert.assertEquals(4,sum);
    }

    @Test
    public void testSUBfromZero() throws Exception{

        Calculator calculator=new Calculator();
        assertEquals(-10,calculator.subtraction(0,10));
    }
    @Test
    public void testSUBfromBigger() throws Exception{

        Calculator calculator=new Calculator();
        assertEquals(10,calculator.subtraction(10,3));
    }
    @Test
    public void testSUBfromSmaller() throws Exception{

        Calculator calculator=new Calculator();
        assertEquals(20,calculator.subtraction(5,10));
    }
}
