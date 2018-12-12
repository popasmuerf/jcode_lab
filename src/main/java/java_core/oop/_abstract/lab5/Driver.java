package java_core.oop._abstract.lab5;
import static java.lang.System.out ;
/**
 * Created by mdb on 6/22/18.
 */

interface A{
    void a() ;
    void b() ;
    void c() ;
    void d() ;
}


abstract class B implements A{
    //public void c(){out.println("I am c()");}
}

class M extends B{
    @Override
    public void a() {
       out.println("I am a()");
    }

    @Override
    public void b() {
        out.println("I am b()");
    }

    @Override
    public void c() {
        out.println("I am c()");
    }

    @Override
    public void d() {
        out.println("I am d()");
    }
}


public class Driver {
    public static void main(String[] args){
        out.printf("Thread  %s: \n" , Thread.currentThread());
        A mObj = new M() ;
        mObj.a() ;
        mObj.b() ;
        mObj.c() ;
        mObj.d() ;
    }
}
