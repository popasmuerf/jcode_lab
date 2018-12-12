package java_core.oop._abstract.lab0;

/**
 * Created by mdb on 6/22/18.
 */
public class Driver {
    public static void main(String[] args){
        ConEntity ce = new ConEntity(1,"one");
        System.out.printf("id  %d: \n", ce.getId());
        System.out.printf("name %s: \n", ce.getName());
    }
}
