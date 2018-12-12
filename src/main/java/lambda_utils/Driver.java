package lambda_utils;

/**
 * Created by mdb on 3/18/18.
 */


//  parameter -> expression body
    /*
        Optional type declarations
        Optiona parenthesis around paramters
        Optional curly braces
        Optional return keywoard
     */
public class Driver {
    public static void main(String[] args){
        MathOps mathOps = new MathOps() ;
        int sum = mathOps.addition.operation(1,2);
        System.out.println(sum);


    }
}
