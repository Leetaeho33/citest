package com.example.citest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void init(){
        calculator = new Calculator();
    }
    @Test
    public void test(){
        int n=1, m=2, result = 0;
        result = calculator.plus(n, m);
        Assertions.assertEquals(result, n+m);
    }

    @Test
    public void test1(){
        int n=1, m=2, result =0;
        result = calculator.minus2(n,m);
        Assertions.assertEquals(result, n-m);
    }
    @Test
    public void test2(){
        int n=1, m=2, result =0;
        result = calculator.multiple(n,m);
        Assertions.assertEquals(result, n-m);
    }
    @Test
    public void test3(){
        int n=1, m=2, result =0;
        result = calculator.multipleTwo(n,m);
        Assertions.assertEquals(result, n+m);
    }
}
