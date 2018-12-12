package java_core.oop._abstract.lab4;
import static java.lang.System.out ;
/**
 * Created by mdb on 6/22/18.
 */
public  abstract class Bike {
    Bike(){
        out.println("bike is created");
    }
    abstract void run() ;
    void changeGear(){
        out.println("gear changed");
    }
}
