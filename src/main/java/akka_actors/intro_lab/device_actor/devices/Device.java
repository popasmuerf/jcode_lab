package akka_actors.intro_lab.device_actor.devices;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

import java.util.Optional;

/**
 * Created by mdb on 5/24/18.
 */
public class Device  extends AbstractActor{
    private final LoggingAdapter log = Logging.getLogger(getContext()
            .getSystem(), this);

    final String groupId ;
    final String deviceId ;

    public Device(String groupId, String deviceId){
        this.groupId = groupId ;
        this.deviceId = deviceId ;
    }

    public static Props props(String groupId, String deviceId){
        return Props.create(Device.class, groupId  , deviceId);
    }


    public static final class ReadTemperature{
        long requestId;
        public ReadTemperature(long requestId){
            this.requestId = requestId;
        }
    }

    public static final class RespondTemperature{
        long requestId ;
        Optional<Double> value ;

        public RespondTemperature(long requestedId,Optional<Double> value){
            this.requestId = requestedId;
            this.value = value ;
        }
    }

    public static class RecordTemperature{
        final long requestedId ;
        final double value ;
        public RecordTemperature(long requestedId,double value){
            this.requestedId  = requestedId ;
            this.value = value ;

        }
    }

    public static class TemperatureRecorded{
        final long requestedId ;
        public TemperatureRecorded(long requestedId){
            this.requestedId  = requestedId ;
        }
    }

    Optional<Double>  lastTemperatureRead = Optional.empty();

    @Override
    public void preStart(){
        log.info("Device actor {}-{} started", groupId, deviceId);
    }

    @Override
    public void postStop(){
        log.info("Device actor {}-{} stopped", groupId, deviceId);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(RecordTemperature.class,r->{
                   log.info("Recorded temperature reading {} with {}", r.value, r.requestedId);
                   lastTemperatureRead = Optional.of(r.value);
                   getSender().tell(new TemperatureRecorded(r.requestedId),getSelf());
                })
                .match(ReadTemperature.class, r -> {
                    getSender()
                            .tell(new RespondTemperature(r.requestId, lastTemperatureRead),getSelf());

                }).build();
    }
}
