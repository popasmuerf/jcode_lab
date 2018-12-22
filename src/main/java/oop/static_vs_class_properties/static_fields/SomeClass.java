package oop.static_vs_class_properties.static_fields;

/**
 * Created by mdb on 12/12/18.
 */
public class SomeClass {
    public static  int someObjCount  ;
    public static void someObjCountInitializer(){
        someObjCount = 0 ;
    }
    public SomeClass(){
        someObjCount ++ ;
    }
}
