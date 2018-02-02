package dao;

/**
 * Created by mdb on 12/11/17.
 */
public class PFSenseArgs {
    String parser  ;
    mdtsdb mdtsdbObj ;
    kafka kafkaObj ;
    public class mdtsdb{
        String clAdmKey ;
        String clAdmSecretKey ;
        public class swimlane{
            String name;
            String appKey;
            String secretKey;
        }
    }
    public class kafka{
        String zkquorum;
        String topic ;
        String group ;
        String broker ;
        Long numThreads ;
    }

}
