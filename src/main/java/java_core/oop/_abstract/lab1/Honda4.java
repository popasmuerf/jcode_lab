package java_core.oop._abstract.lab1;

/**
 * Created by mdb on 6/22/18.
 */
public class Honda4 extends Bike {
    @Override
    void run() {
        System.out.println("running safely...");
    }
    public static void main(String args[]){
        Bike obj = new Honda4() ;
        obj.run();
    }
}
