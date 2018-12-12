package reflection;

import java.lang.reflect.Field;

import static java.lang.System.out;

/**
 * Created by mdb on 3/23/18.
 */
public class Driver {
    public static void main(String args[]) {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        ClassC objC = new ClassC();
        Class classA = objA.getClass();
        Class classB = objB.getClass();
        Class classC = objC.getClass();


        String arrayA[] = {"a", "b", "c"};
        int arrayB[] = {1, 2, 3,};
        byte[] bytes = new byte[1024];

        Class lstAClass = arrayA.getClass();
        Class lstBClass = arrayB.getClass();
        Class bytesClass = bytes.getClass();


        int varA = 0;
        int varB = 1;
        int varC = 2;

        Class intClass = int.class;
        Class booleanClass = boolean.class;
        Class threeDArrayClass = int[][][].class;
        Class integerType = Integer.TYPE;
        Class voidType = Void.TYPE;


        Class printStreamClass = java.io.PrintStream.class;
        Class mathClass = java.lang.Math.class;

        try {
            Class gsonClass = Class.forName("com.google.code.gson");
            Class typeSafeClass = Class.forName("com.typesafe");
        } catch (ClassNotFoundException classNotFoundException) {

        }

        Class class0 = javax.swing.JButton.class.getSuperclass();
        //System.out.println(class0.toString());

        Class<?>[] classLst = ClassA.class.getClasses() ;
        for( int j = 0; j < classLst.length; j++){
            out.println(classLst[j].toString());
            //System.out.println(j);
        }
        out.println(classLst.length);


        try {
            Field f1 = System.class.getField("out");
            out.println("Field f1  : " + f1);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


        //Examining Class Modifiers and Types

    }
}