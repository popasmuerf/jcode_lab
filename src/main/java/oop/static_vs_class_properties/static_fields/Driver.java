package oop.static_vs_class_properties.static_fields;
import static java.lang.System.out ;

/**
 * Created by mdb on 12/12/18.
 */
public class Driver {
    public static void main(String[] args){
        SomeClass.someObjCountInitializer();
        out.println(SomeClass.someObjCount);
        SomeClass someObj1 = new SomeClass() ;
        SomeClass someObj2 = new SomeClass() ;
        SomeClass someObj3 = new SomeClass() ;
        out.println(SomeClass.someObjCount);
        {
            //A useless scope that does nothing
        }
    }
}
