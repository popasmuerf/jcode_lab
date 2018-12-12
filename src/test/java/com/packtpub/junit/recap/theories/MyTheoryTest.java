package com.packtpub.junit.recap.theories;

import org.junit.After;
import org.junit.Before;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import types.Transformer;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mdb on 6/2/18.
 */
@RunWith(Theories.class)
public class MyTheoryTest {
    @Before
    public void runBeforeTheory(){
        System.out.println("MyTheoryTest.runBeforeTheory()");
    }

    @After
    public void runAfterTheory(){
        System.out.println("MyTheoryTest.runAfterTheory()");
    }

    @DataPoint
    public static String user1 = "optimus";

    @DataPoint
    public static String user2 = "optimus prime";




    @DataPoint
    public static  String user3 = "rodimus";

    @DataPoint
     public static String user4 = "rodimus prime";



    @DataPoint
    public static double doubleArray[] = new double[] {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};

    @DataPoint
    public static  double value = 1.0 ;


    @Theory
    public void testReals(double value){

        assertThat(new Double(value).toString() , value > -1);
    }

    @Theory
    public void testRealPairs(double value0 , double value1){
        System.out.print("val0 : " + new Double(value0).toString()  +",");
        System.out.print("val1 : " + new Double(value1).toString()  +",");
        System.out.println("");

        assertThat(new Double(value).toString() , (value0 * value1) > -1);
    }



    @Theory
    public void checkDesignations(String username){
        assertThat(new Transformer(username).toString() , containsString("designation :"));
    }

    @Theory
    public void theoryPrintStr1(){

    }
}
