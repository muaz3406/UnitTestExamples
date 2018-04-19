package com.muaz.unittest.calculator;

import org.junit.Test;


public class Calculator {


    public int summation(int num1,int num2){
        return num1+num2;
    }

    public int subtraction(int num1,int num2){
        return num1-num2;
    }

    @Test
    public int areaCalculate(int width,int length){
     return width*length;

    }
}
