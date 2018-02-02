import dao.KafkaDAO ;

import com.google.gson.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by mdb on 9/19/17.
 */
public class Driver {
    public static void main(String[] args){
        Method[] methods = KafkaDAO.class.getMethods() ;
        for(Method method : methods){
            System.out.println("method " + method.getName());
        }
    }


}
