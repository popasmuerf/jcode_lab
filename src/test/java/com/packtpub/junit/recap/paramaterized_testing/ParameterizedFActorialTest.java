package com.packtpub.junit.recap.paramaterized_testing;
import common_examples.Factorial;
import org.junit.Test;
import org.junit.runner.RunWith ;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
//import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
/**
 * Created by mdb on 4/9/18.
 */
@RunWith(Parameterized.class)
public class ParameterizedFActorialTest {
    @Parameterized.Parameters
    public static Collection<Object[]> factorialData(){
        return Arrays.asList(new Object[][]{
                {0,1},{1,1},{2,2},{3,6},{4,24},{5,120},{6,720}
        });
    }

    private int number ;
    private int expectedResult ;
    public ParameterizedFActorialTest(int input, int expected){
        number = input ;
        expectedResult = expected;
    }

    @Test
    public void factorial() throws Exception{
        Factorial fact = new Factorial();
        assertEquals(fact.factorial(number),expectedResult);
    }
}
