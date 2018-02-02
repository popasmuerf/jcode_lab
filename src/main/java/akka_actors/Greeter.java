package akka_actors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;

/**
 * Created by mdb on 12/11/17.
 */

/*
  https://developer.lightbend.com/guides/akka-quickstart-java/define-actors.html
 */
public class Greeter extends AbstractActor {

    static public Props props(String message, ActorRef printerActor){
       // return Props.create(Greeter.class,() -> new Greeter(message,printerActor));
        return null ;
    }
    @Override
    public Receive createReceive() {
        return null;
    }


    static public class Greet{
        public Greet(){

        }
    }


}
