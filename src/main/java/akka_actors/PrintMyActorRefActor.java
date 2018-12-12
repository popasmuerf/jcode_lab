package akka_actors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;

/**
 * Created by mdb on 5/14/18.
 */
public class PrintMyActorRefActor extends AbstractActor {
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .matchEquals("first", p -> {ActorRef firstRef = getContext().actorOf(Props.empty(),"firstActor");
                System.out.println("Second: " + firstRef);})
                .matchEquals("second", p-> {ActorRef secRef = getContext().actorOf(Props.empty(),"secondActor");
                    System.out.println("Second: " + secRef);})
                .matchEquals("third", p-> {ActorRef thirdRef = getContext().actorOf(Props.empty(),"thirdActor");
                    System.out.println("Second: " + thirdRef);})
                .matchEquals("printit", p -> {
                    ActorRef secondRef = getContext().actorOf(Props.empty(), "second-actor");
                    System.out.println("Second: " + secondRef);
                })
                .build();}
}
