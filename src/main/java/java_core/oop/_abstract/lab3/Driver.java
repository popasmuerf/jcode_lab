package java_core.oop._abstract.lab3;
import static java.lang.System.out;
/**
 * Created by mdb on 6/22/18.
 */
public class Driver {
    public static void main(String[] args){
        Bank sbi = new SBI();
        out.println(sbi.getRateOfInterest());
        Bank pnb = new PNB() ;
        out.println(pnb.getRateOfInterest());
    }
}
