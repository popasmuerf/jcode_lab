package akka_actors.intro_lab.actor_arch;

import akka.actor.AbstractActor;
import akka.actor.ActorPath;
import akka.actor.ActorRef;

/**
 * Created by mdb on 5/21/18.
 */
public class SupervisedActor extends AbstractActor {
    @Override
    public void preStart(){
        System.out.println("supervised actor started");
         ActorPath actorPath = getSelf().path() ;
         String strActorPath = actorPath.toString();
         System.out.println("Actor Path: " +  strActorPath);
    }
    @Override
    public void postStop(){
        System.out.println("supervised actor stopped");
    }
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .matchEquals("fail", f -> {
                    System.out.println("supervised actor fails now");
                    throw new Exception(("I failed "));
                }).build();
    }
}
