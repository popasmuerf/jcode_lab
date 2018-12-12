package akka_actors.intro_lab.actor_arch;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * Created by mdb on 5/21/18.
 */
public class Driver {
    public static void main(String[] arg)throws java.io.IOException{
        ActorSystem system = ActorSystem.create("ActorSystemArchLab");
        ActorRef act0Ptr = system.actorOf(Props.create(Actor1.class),"act1");
        act0Ptr.tell("one",ActorRef.noSender());
        act0Ptr.tell("two",ActorRef.noSender());
        act0Ptr.tell("three",ActorRef.noSender());
        act0Ptr.tell("stop",ActorRef.noSender());


        ActorRef act1Ptr = system.actorOf(Props.create(SupervisorActor.class),"act2");
        act1Ptr.tell("failChild",ActorRef.noSender());

        System.out.println(">>> Press Enter to EXIT <<<");
        try{
            System.in.read();
        }finally{
            system.terminate();
        }

    }
}
