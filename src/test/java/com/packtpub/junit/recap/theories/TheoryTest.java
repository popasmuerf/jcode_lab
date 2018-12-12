package com.packtpub.junit.recap.theories;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static java.lang.System.out;

/**
 * Created by mdb on 4/11/18.
 */
@RunWith(Theories.class)
public class TheoryTest {

    @DataPoint
    public static String jack  ="Jack";
    @DataPoint
    public static String mike = "Mike";
    @DataPoint
    public static String phil = "Phil";
    @DataPoints
    public static char[] chars = new char[]{'A','B','C'};


    //@Theory
    //public void sanity(String aName){
       // System.out.println("Sanity check" + aName);
    //}

    @Theory
    public void sanity(String firstName, String lastName){out.println("Sanity check "+ firstName + " " + lastName);}

    @Theory
    public void build(char c,char d){out.println(c+" "+d);}
}
