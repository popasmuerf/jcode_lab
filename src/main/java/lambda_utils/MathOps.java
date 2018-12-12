package lambda_utils;

/**
 * Created by mdb on 3/18/18.
 */
public class MathOps {
    MathOperation addition = (int a, int b) -> a + b ;
    MathOperation subtraction = (int a, int b) -> a - b ;
    MathOperation multiplation = (int a, int b) -> {return a - b ;};
    MathOperation division = (int a, int b ) -> {
        if(b == 0 ){
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }else{
            return a/b ;
        }
    };
}
