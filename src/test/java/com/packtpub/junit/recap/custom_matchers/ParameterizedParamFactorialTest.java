package com.packtpub.junit.recap.custom_matchers;

import common_examples.Factorial;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by mdb on 4/9/18.
 */
@RunWith(Parameterized.class)
public class ParameterizedParamFactorialTest {
    private int number ;
    private int expectedResult ;
    /*
    @Parameterized.Parameter(value=0)
    private int number ;
    @Parameterized.Parameter(value=1)
    private int expectedResult ;
    */
    public ParameterizedParamFactorialTest(int input, int expected){
         number = input;
         expectedResult = expected ;
    }

    @Parameterized.Parameters(name = "{index}:factorial({0})={1}")
    public static Collection<Object[]> factorialData(){
        return Arrays.asList(new Object[][]{
                {0,1},{1,1},{2,2},{3,6},{4,24},{5,120},{6,720}
        });
    }

    @Test(timeout = 10)
    public void factorial() throws Exception{
        Factorial fact = new Factorial();
        assertEquals(fact.factorial(number),expectedResult);
    }
}
