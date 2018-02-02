import lambda_utils.Utils;

import java.util.function.Function;

/**
 * Created by mdb on 12/10/17.
 */

/*
    https://dzone.com/articles/functional-programming-java-8

    This function:
        x -> x + 1
    How do we do this in Java ?

    Binding lambda expressions to variables
    to different types:

    Function<Integer,Integer> add1 = x -> x + 1 ;
    Function<String,String> concat = x -> x +  1 ;

    Integer num = add1.apply(1);
    String str = concat.apply(applecake);

    // or we can use method references ....

    public class Utils {
       publicstatic Integer add1(Integer x) { return x + 1; }
       publicstatic String concat1(String x) { return x + 1; }
    }

    Function<Integer,Integer> add1 = Utils::add1;
    add1(405) ;
    Utils::concat("apple" = Utils::concat1 ;
    concat1("apple") ;



    High Order Programming
    --------------------------------------------
    The cool thing about functions is that they
    encapsuate behaviiors, that we can
    pass around to other functionss
    or methods  for later use.
    Functions that operate on(or produce new functions)
    are called high order function, and the type
    of associated programming is called
    "high order programming"

    Example of a function creating a function:

        Function<Integer, Function<Integer,Integer>> makeAdder = x -> y -> x + y ;


 */
public class LambdaBasics {
    public static void main(String args[]){

        //binding to a reference.....
        Function<Integer,Integer> add0 = x -> x + 1 ;
        Function<String,String> concat = x -> x +  1 ;
        Integer two = add0.apply(1); System.out.println(two);
        String str = concat.apply("home"); System.out.println(str);

        //Using method refernecers

        Function<Integer,Integer> three = Utils::add1;
        Function<String, String> str3 = Utils::concat1 ;

        //Example of a function creating a function:

        Function<Integer, Function<Integer,Integer>> makeAdder = x -> y -> x + y ;
        Function<Integer,Integer> add1 = makeAdder.apply(1);
        Function<Integer,Integer> add2 = makeAdder.apply(2);
        Function<Integer,Integer> add3 = makeAdder.apply(3);

    }
}
