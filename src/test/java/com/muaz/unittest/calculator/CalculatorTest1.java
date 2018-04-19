package com.muaz.unittest.calculator;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by muazt on 30.01.2018.
 */

public class CalculatorTest1 {

    @Test
    public void testSUM(){

        //preliminary
        Calculator calculator=new Calculator();
        int num1=3;
        int num2=1;

        //invoke method
        int sum=calculator.summation(num1,num2);

        //check results
        Assert.assertEquals(4,sum);

        int difference=calculator.subtraction(num1,num2);
        assertEquals(2,difference);
    }

    @Test
    public void testSUB() throws Exception{

        Calculator calculator=new Calculator();
        assertEquals(10,calculator.subtraction(10,3));
        assertEquals(12,calculator.subtraction(12,0));
        assertEquals(20,calculator.subtraction(25,5));
    }
}
