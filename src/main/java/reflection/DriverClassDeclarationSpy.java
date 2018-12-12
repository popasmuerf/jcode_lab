package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import static java.lang.System.out;

/**
 * Created by mdb on 3/28/18.
 * https://docs.oracle.com/javase/tutorial/reflect/class/classModifiers.html
 */
public class DriverClassDeclarationSpy {
    public static void main(String... args) throws ClassNotFoundException {
        //Class<?> c = Class.forName(args[0]);
        //Class<?> c = Class.forName("reflection.ClassA");
        //Class<?> c = Class.forName("javax.swing.JFrame");
        //Class<?> c = Class.forName("java.util.concurrent.ConcurrentNavigableMap");
        //Class<?> c = Class.forName("java.io.InterruptedIOException");
        Class<?> c = Class.forName("java.security.Identity");
        out.format("Canonical Class Name:%n %s%n", c.getCanonicalName() );
        out.format("Class Modifiers:%n %s%n%n", Modifier.toString(c.getModifiers()));
        TypeVariable[] tv = c.getTypeParameters();
        if(tv.length != 0) {
            out.format(" ");
            for (TypeVariable t : tv) {
                out.format("Type variable : %s ", t.getName());
                out.format("%n%n");
            }
        }else {
                out.format("  -- No Type Parameters --%n%n");
            }
        out.format("Implemented Interfaces:%n");
        Type[] intfs = c.getGenericInterfaces();
        if(intfs.length != 0){
            for(Type intf : intfs){
                out.format("Implemented interface  %s%n", intf.toString());
                out.format("%n");
            }
        }else{
            out.format("  -- No Implemented Interfaces --%n%n");
        }
        out.format("Annotations:%n");
        Annotation[] ann = c.getAnnotations() ;
        if(ann.length != 0){
            for(Annotation a : ann){
                out.format("Implemented Annotation  %s%n", a.toString());
                out.format("%n");
            }
        }else{
            out.format("  -- No Implemented Annotations --%n%n");
        }
    }

}

