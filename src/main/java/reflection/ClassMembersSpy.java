package reflection;
import java.lang.reflect.Constructor ;
import java.lang.reflect.Field;
import java.lang.reflect.Method ;
import java.lang.reflect.Member;
import static java.lang.System.out ;

/**
 * Created by mdb on 4/15/18.
 * There are two categories of methods provided
 * in :
 *  Class
 *  dor accessing fields, methods, and
 *  constructors: method which eneumerate these
 *  memebers and methods which search for particular memebers.
 *  Also there are distinct methods for accessing
 *  members declared directly on the class versus methods
 *  which search the superinterfaces and superclasses for inherited
 *  memeers.
 */
enum ClassMember{CONSTRUCTOR, FIELD, METHOD, CLASS, ALL}
public class ClassMembersSpy {
    public static void main(String[] args){
        try{
            Class<?> c = Class.forName(args[0]);
            out.format("Class:%n  %s%n%n", c.getCanonicalName());
            Package p = c.getPackage() ;

            out.format("Package:%n  %s%n%n",
                    (p != null ? p.getName() : "-- No Package --"));

            for (int i = 1; i < args.length; i++) {
                switch (ClassMember.valueOf(args[i])){
                    case CONSTRUCTOR:
                        printMembers(c.getConstructors(),"");
                    case FIELD:
                        printMembers(c.getFields(),"Fields");
                }
            }


        }catch(ClassNotFoundException x){
            x.printStackTrace();
        }
    }


    private static void printMembers(Member[] mbrs,String s){
        out.format("%s:%n", s);
        for (Member mbr : mbrs) {
            if (mbr instanceof Field)
                out.format("  %s%n", ((Field)mbr).toGenericString());
            else if (mbr instanceof Constructor)
                out.format("  %s%n", ((Constructor)mbr).toGenericString());
            else if (mbr instanceof Method)
                out.format("  %s%n", ((Method)mbr).toGenericString());
        }
        if (mbrs.length == 0)
            out.format("  -- No %s --%n", s);
        out.format("%n");
    }
}
