import com.google.gson.Gson;
import types.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mdb on 12/10/17.
 */

/*
    https://www.codementor.io/eh3rrera/using-java-8-method-reference-du10866vx


    In java 8, thatnks to lambda expressions,
    we can do something like this...wec
    use methods as if they were objects, or primitive
    values.


    A method reference is the shorhand syntax for a
    lambda expression for a lambda
    expression that execurtes just ONE
    method.  Here's the general syntax of
    a method refernece:

    Object :: methodName


    We know that we can use lambda expressions
    instead of using an anonyous
    class.
    But sometimes, the lambda
    expression is really just a
    call to some method ....for example:

    Consumer<String> c = s -> System.out.println(s);

    Making the coe clearere, we can turn that
    lambda expression into the reference:


    Consumer<String> c = System.out::println;



    Data bindng API isued to convert JSON
    to and from POJO(plain old java object)
    using  property accessor or using
    annotations.  It is of two types.

        *   Primitives Data Binding -- Converts
            JSON to and from Java Maps,
            Lists, Strings, Numbers, Booleans
            and NULL objects

        *   Objects Data Binding -- Converts JSON
        *   to and from any Java type


    In a method reference, you place the object(or class)
    that contains the method befroe
    the "::" operator and the name
    of the method after it without arguments

    Primitives Data Binding
    ---------------------------------------
    Primitives data binding referes to mapping
    of JSON to Java Core data types
    inbuilt collections.  Gson provides
    variousinbuilt adapters which can be
    used to serialize/deserialize primitive data types.




 */
public class GSONPrimitiveAndObjectMapping {
    public static void main(String args[]) {
        Gson gson = new Gson() ;
        String name = "Mahesh Kumar";
        long rollNo = 1 ;
        boolean verified = false ;
        int[] marks = {100,90,85};
        //Serializaion
        System.out.println("{");
        System.out.println("name: " + gson.toJson(name) +",");
        System.out.println("rollNo: " + gson.toJson(rollNo) +",");
        System.out.println("verified: " + gson.toJson(verified) +",");
        System.out.println("marks:" + gson.toJson(marks));
        System.out.println("}");

        //Deserializer
        name = gson.fromJson("\"Mike Brown\"",String.class);
        rollNo = gson.fromJson("1",Long.class);
        verified = gson.fromJson("false",Boolean.class);
        marks = gson.fromJson("[100,90,85]",int[].class);

        System.out.println("name : " + name );
        System.out.println("rollNo : " + rollNo);
        System.out.println("verified : " + verified);
        System.out.println("marks : " + Arrays.toString(marks) );
    }


}
