package com.packtpub.junit.recap.base_testing;
import com.packtpub.junit.recap.custom_matchers.LessThanOrEqual;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.core.CombinableMatcher;
import org.junit.*;

import java.util.Arrays;
import java.util.List;

//import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import com.packtpub.junit.recap.* ;

/**
 * Created by mdb on 3/21/18.
 */
public class SanityTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("***Before Class is invoked");
    }

    @Before
    public void before(){
        System.out.println("_____________");
        System.out.println("\t Before is invoked");
    }
    @After
    public void after(){
        System.out.println("\t After is invoked");
        System.out.println("===================");
    }
    @Test
    public void someTest0(){
        System.out.println("\t\t someTest-0 is invoked");
    }
    @Test
    public void someTest1(){
        System.out.println("\t\t someTest-1 is invoked");
    }
    @Test
    public void someTest2(){
        System.out.println("\t\t someTest-2 is invoked");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("***After Class is invoked");
    }
    @Test
    public void verify_multiple_values() throws Exception{
        double marks = 100.00 ;
        assertThat(marks,either(CoreMatchers.is(100.00)).or(CoreMatchers.is(90.0)));
    }
    @Test
    public void verify_collection_values() throws Exception{
        List<Double> salary = Arrays.asList(50.0,200.0,500.0);
        assertThat(salary, CoreMatchers.hasItem(50.00));
        assertThat(salary,CoreMatchers.hasItem(200.00));
        assertThat(salary,CoreMatchers.not(CoreMatchers.hasItem(400.0)));
    }
    @Test
    public void verify_Strings() throws Exception{
        String n1 = "Mike Brown";
        String n2 = "Kevin Robinson";
        String n3 = "Phil Bossi";
        String n4 = "Judge Reynhold";
        assertThat(n1 , startsWith("Mike"));
        assertThat(n2, startsWith("K"));
        assertThat(n3, containsString("il"));
        assertThat(n4, endsWith("hold"));
    }
    @Test
    public void lessThanOrEq()throws Exception{
        int actualGoalScore = Integer.MAX_VALUE ;
        int testGoalScore = Integer.MIN_VALUE ;
        int correctGoalScore = Integer.MAX_VALUE ;
        String name = "MikeyB";
        Integer two = 2 ;
        assertThat(actualGoalScore,LessThanOrEqual.lessThanOrEqual(correctGoalScore));
        assertThat(name,LessThanOrEqual.lessThanOrEqual("MikeyB"));
    }

    @Test(timeout = 9)
        public void forEver() throws Exception{
            try {
                Thread.sleep(8);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


}
