package dao;
import org.slf4j.* ;
import org.slf4j.LoggerFactory;

/**
 * Created by mdb on 12/12/17.
 */
public class KafkaDAO {
    String zkquorum ;
    String topic ;
    String group ;
    String broker ;
    Long numThreads ;
    void setZkQuorum(String  zkquorum){
        this.zkquorum = zkquorum ;
    }
    String getZkquorum(){
        return zkquorum ;
    }
    void setTopic(String topic){
        this.topic = topic ;
    }
    String getTopic(){
        return topic ;
    }
    void setBroker(String secretKey){
        this.broker = broker ;
    }
    String getBroker(){
        return broker ;
    }
    Long getNumThreads(){
        return numThreads ;
    }
    void setNumThreads(Long numThreads){
        this.numThreads = numThreads ;
    }


}
