package com.packtpub.junit.recap.base_testing;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;

/**
 * Created by mdb on 4/19/18.
 *
 *
 * Theories allow for better readability and number of
 * input permutations given any provided set of values
 * for testing without as much typing as @Test annotated test
 * classes
 */

@RunWith(Theories.class)
public class AdditionWithTheoriesTest {
    @DataPoints
    public static int[] positiveIntegers(){
        return new int[]{1, 10, 1234567};
    }
    @Theory
    public void a_plus_b_is_greater_than_a_and_greater_than_b(
            Integer a,
            Integer b
    ){
        assertTrue(a + b > a );
        //assertTrue( a + b > b);
    }
    @Theory
    public void addition_is_commutative(Integer a, Integer b){
           assertTrue(a + b == b + a);
    }

    @Theory
    public void subtraction_is_not_commutative(Integer a, Integer b){
        assertTrue(a - ( -b) == b - (-a) );
    }

    @Theory
    public void multiplication_is_commutative(Integer a, Integer b){
        assertTrue(a * b == b * a);
    }

}
