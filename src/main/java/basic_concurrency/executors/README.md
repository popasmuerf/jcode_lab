Factory Methods of teh Executors Class
===========================================
The easiest way to create ExecutorService is to use
one of the factory methods of the 
Executors class.


For example, the following line of code will create a 
thread-pool with 10 threads


        ExecutorService executor = Executors.newFixedThreadPool(10);
        



The are several other factory methods to crate predefined
ExecutorService that meets specific use cases.
To find the best method for your needs, consult
Oracle's offical documentation.




Directly Create an ExecutorService
===========================================
Because the ExecutorService is an interface, an intance of
any of it's implementations can be used.
there re several implmenations to choose from in the package:

    java.util.concurrent
    

...or you can roll your own.


For example, the ThreadPoolExecutor class has a few constructors which can be  to 
used to configure an executor service and its internal pool.
 
 
        ExecutorService executorServie = 
        new ThreadPoolExecutor(1,1,0L,Timenit.MILLISECONDS,
        new LinkedBlockingQueue<Runnable>());
        
        
You may notice that the code above is very similar to the  source code
of the factory method  

    newSingleThreadExecution() ;

For most cases, a detailed manual configuration isn't
necessary.




How do we Assign tasks to the executor Service
====================================================
ExecutorService can execute

    Runnable 
    //and
    Callable
    
tasks.  To keep things simple in this 
article, two primitive taks will be used.  Notice that
lambda expressions are used here intead
of anonymous innner classes:


    Runnable runnableTask = () -> {
        try{
            TimeUnit.MILLISECONDS.sleep(300) ;
        }catch(InterruptedException e){
            
        }
    }


Is there any decernable reason why I would choose to use a closure instead
of assigning an anonymous inner class ?


    Runnable runnableTask = new Runnable(){
        try{
              TimeUnit.MILLISECONDS.sleep(300) ;
        }catch(InterruptedException e){
                    
        }
    }



^^^^ I don't really see the point.




