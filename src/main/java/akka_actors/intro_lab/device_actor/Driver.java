package akka_actors.intro_lab.device_actor;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

/**
 * Created by mdb on 5/22/18.
 */
public class Driver {
    public static void main(String[] args)throws java.io.IOException{
        ActorSystem system = ActorSystem.create("iot-system");


        try{
            ActorRef supervisor = system.actorOf(IoTSupervisor.props(),"iot-supervisor");
            System.out.println(">>> Press ENTER to exit the system <<<");
            System.in.read();
        }finally {
            system.terminate();
        }
    }//end main()

}//end Driver Class Definition
