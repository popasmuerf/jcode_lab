package com.packtpub.junit.recap.theories;

import com.packtpub.junit.recap.theories.supplier_classes.NumberSupplier;
import org.junit.experimental.theories.*;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mdb on 4/13/18.
 */


@RunWith(Theories.class)
public class ExternalTheoryTest {
    @Theory
    public void add_numbers(
            @ParametersSuppliedBy(NumberSupplier.class) Number num1,
            @ParametersSuppliedBy(NumberSupplier.class) Number num2
    ){
        System.out.println(num1 +  " " +  num2);
    }

}

