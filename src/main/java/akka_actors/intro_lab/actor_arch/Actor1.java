package akka_actors.intro_lab.actor_arch;

import akka.actor.AbstractActor;
import akka.actor.ActorPath;
import akka.actor.Props;

/**
 * Created by mdb on 5/21/18.
 */
public class Actor1 extends AbstractActor {
    @Override

    public void  preStart(){
        System.out.println("Actor1 started");
        ActorPath actorPath = getSelf().path();
        System.out.println("Actor Path: " + actorPath.toString());
        getContext().actorOf(Props.create(Actor2.class),"act2");
    }

    @Override
    public void postStop(){
        System.out.println("Actor1 stopped");
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .matchEquals("stop", s -> {
                    getContext().stop(getSelf());
                }).matchEquals("one", s -> {
                    System.out.println("one");
                }).matchEquals("two", s -> {
                    System.out.println("two");
                }).matchEquals("three", s -> {
                    System.out.println("three");
                }).build();
    }
}
