package akka_actors.intro_lab.actor_arch;

import akka.actor.AbstractActor;
import akka.actor.ActorPath;

/**
 * Created by mdb on 5/21/18.
 */
public class Actor2 extends AbstractActor {
    @Override
    public void preStart() {
        System.out.println("Actor2 started");
        ActorPath actorPath = getSelf().path();
        System.out.println("Actor Path: " + actorPath.toString());
    }

    @Override
    public void postStop() {
        System.out.println("Actor2 stopped");
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder().build();
    }


}