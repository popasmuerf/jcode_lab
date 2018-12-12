package com.packtpub.junit.recap.base_testing;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat ;
import org.junit.Test ;

/**
 * Created by mdb on 3/23/18.
 */
public class AssertThatTest {
    @Test
    public void verify_Matcher(){
        int age = 30 ;
        assertThat(age, equalTo(30));
        assertThat(age, is(30));
        assertThat(age,not(equalTo(33)));
        assertThat(age, is(not(33)));
    }
    @Test
    public void verify_multiple_values()throws Exception{
        double marks = 100.00;
        assertThat(marks,either(is(100.00)).or(is(90.9)));
        //assertThat(marks,both(not(100.00)).and(is(90.9)));
    }

}