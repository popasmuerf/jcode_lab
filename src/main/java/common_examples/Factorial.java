package common_examples;

/**
 * Created by mdb on 4/9/18.
 */
public class Factorial {
    public long factorial(long number){
        if(number == 0){
            return 1 ;
        }
        return number * factorial(number - 1);
    }
}
