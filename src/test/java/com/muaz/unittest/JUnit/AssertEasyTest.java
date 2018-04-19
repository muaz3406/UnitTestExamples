package com.muaz.unittest.JUnit;

import com.muaz.unittest.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class AssertEasyTest {

    private Calculator calculator=new Calculator();

    @Test
    @Parameters("10,2,20")
    public void testareaCalculator(int width,int length,int totalArea) throws Exception{
        assertEquals(totalArea,calculator.areaCalculate(width,length));
    }

}
