package basic_concurrency.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by mdb on 9/28/18.
 */

//https://www.baeldung.com/java-executor-service-tutorial

public class Driver {
    public static void main(String args[]){
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Runnable runnableTask = () -> {
            try{
                TimeUnit.MILLISECONDS.sleep(300);
            }catch(InterruptedException e){
                e.printStackTrace();;
            }
        } ;

        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution ";
        };


        List<Callable<String>>  callableTasks = new ArrayList<>() ;


    }






}
