package akka_actors.intro_lab.device_actor;

import java.util.Optional;

/**
 * Created by mdb on 5/22/18.
 */
public class DashBoard {

    /**
     * Created by mdb on 5/22/18.
     */
    public static final class  RespondTemperature {
        long requestId ;
        final Optional<Double> value ;
        public RespondTemperature(Optional<Double> value ){
            this.value = value ;
        }
    }
}//end o
