package akka_actors.intro_lab.actor_arch;

import akka.actor.AbstractActor;
import akka.actor.ActorPath;
import akka.actor.ActorRef;
import akka.actor.Props;

/**
 * Created by mdb on 5/21/18.
 */
public class SupervisorActor extends AbstractActor {
    @Override
    public void preStart(){
        ActorPath actorPath = getSelf().path();
        String strActorPath = actorPath.toString();
        System.out.println("Actor Path: " +  strActorPath);
    }
    ActorRef child =  getContext().actorOf(Props.create(SupervisedActor.class),"s1");

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .matchEquals("failChild", f -> {
                    child.tell("failChild",getSelf());
                }).build();
    }
}
