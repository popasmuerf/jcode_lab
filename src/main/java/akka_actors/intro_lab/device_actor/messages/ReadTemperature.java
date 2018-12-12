package akka_actors.intro_lab.device_actor.messages;

/**
 * Created by mdb on 5/22/18.
 */
public class ReadTemperature {
    long requestId ;
    public ReadTemperature(long requestId){
        this.requestId = requestId ;
    }
}
