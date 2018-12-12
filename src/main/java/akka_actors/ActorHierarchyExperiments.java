package akka_actors;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

import static java.lang.System.out ;

/**
 * Created by mdb on 5/14/18.
 */
public class ActorHierarchyExperiments {
    public static void main(String args[])throws java.io.IOException{
        ActorSystem system = ActorSystem.create("testSystem");
        ActorRef firstRef = system.actorOf(Props.create(PrintMyActorRefActor.class),"firstActor") ;
        ActorRef secRef = system.actorOf(Props.create(PrintMyActorRefActor.class),"secondActor") ;
        ActorRef thirRef = system.actorOf(Props.create(PrintMyActorRefActor.class),"thirdActor") ;
        firstRef.tell("first",ActorRef.noSender());
        secRef.tell("second",ActorRef.noSender());
        thirRef.tell("third",ActorRef.noSender());
        System.out.println(">>> Press Enter to EXIT <<<");
        try{
            System.in.read();
        }finally{
            system.terminate();
        }
    }
}
