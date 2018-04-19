package com.muaz.unittest.JUnit;

import com.muaz.unittest.calculator.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterTest{

    private Calculator calculator=new Calculator();
    @Parameterized.Parameters
    private static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {10,2,20},
                {20,2,40},
                {5,2,10},
                {24,2,48},
                {6,2,12}});
    }
    private int width;
    private int length;
    private int totalArea;


    public ParameterTest(Calculator calculator, int width, int length, int totalArea) {
        this.calculator = calculator;
        this.width = width;
        this.length = length;
        this.totalArea = totalArea;
    }

    @Test
    public void testareCalculator() throws Exception{
        assertEquals(totalArea,calculator.areaCalculate(width,length));

    }

}
