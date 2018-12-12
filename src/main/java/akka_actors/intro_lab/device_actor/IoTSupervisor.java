package akka_actors.intro_lab.device_actor;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

/**
 * Created by mdb on 5/22/18.
 */
public class IoTSupervisor extends AbstractActor {
    private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(),this);

    public static Props props(){
        return Props.create(IoTSupervisor.class);
    }

    @Override
    public void preStart(){
        log.info("IoT Application started...");
    }
    @Override
    public void postStop(){
        log.info("IoT Application stopped...");
    }

    /**
     * This actor does not handle any messages
     */

    @Override
    public Receive createReceive() {
        return receiveBuilder().build();
    }







}//end of Actor Class Definition
