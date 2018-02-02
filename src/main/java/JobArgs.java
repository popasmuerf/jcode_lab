import java.util.LinkedHashMap;

/**
 * Created by mdb on 12/6/17.
 */
public class JobArgs{
    String parser = null;
    LinkedHashMap<String,LinkedHashMap<String,String>> mtsdb  = new LinkedHashMap<String,LinkedHashMap<String,String>>();
    LinkedHashMap<String,LinkedHashMap<String,String>> kafka  = new LinkedHashMap<String,LinkedHashMap<String,String>>();
    public JobArgs(){
    }//end -- constructor

    public void setPaser(String parser){
        this.parser = parser;
    }
    public String getParser(){
        return parser ;
    }
    public void setMtsdb( LinkedHashMap<String,LinkedHashMap<String,String>> mtsdb){
        this.mtsdb = mtsdb;
    }
    public LinkedHashMap<String,LinkedHashMap<String,String>> getMtsdb(){
        return mtsdb ;
    }
    public void setKafka( LinkedHashMap<String,LinkedHashMap<String,String>> mtsdb){
        this.kafka = mtsdb;
    }
    public LinkedHashMap<String,LinkedHashMap<String,String>> getKafka(){
        return kafka  ;
    }
}