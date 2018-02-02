import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dao.PFSenseArgs;

/**
 * Created by mdb on 12/11/17.
 */
public class GSONWork {
    public static void main(String args[]){
        String PARSER =  "parser";
        String MDTSDB_ROOT = "mdtsdb";
        String SWL_ROOT = "swimlane" ;
        String KAFKA_ROOT = "kafka";
        JsonObject argsPayload ;
        JsonObject dataPayload ;

        String jsonStr = "   { \n" +
                "\n" +
                "   \t\t\"parser\":\"pfsense\",  \n" +
                "\t    \"mdtsdb\":{            \n" +
                "\t    \t\t\t\"clAdmKey\":\"W9gHftKKR8Zl1I\",\n" +
                "\t    \t\t    \"clAdmSecretKey\":\"U9sh7SRIbFjnPR\",\n" +
                "\t    \t\t    \"swimlane\":{\n" +
                "\t    \t\t               \t\"name\":\"swl_mdb\",\n" +
                "\t    \t\t               \t\"appKey\":\"TNSpAyfh8\",\n" +
                "\t    \t\t               \t\"secretKey\":\"N46DKaO2ZyMSL\"\n" +
                "\t    \t\t    }\n" +
                "\t    },\n" +
                "\t    \"kafka\":{        \n" +
                "\t    \t\t\t\"zkquorum\":\"10.0.2.118:2181\",\n" +
                "\t    \t\t\t\"topic\":\"pfsense\",    \n" +
                "\t    \t\t\t\"group\":\"log-handler\",\n" +
                "\t    \t\t\t\"broker\":\"10.0.2.11:1025\",       \n" +
                "\t    \t\t\t\"numThreads\":1\n" +
                "\t    }\n" +
                "    }";


        String jsonBook = "{\n" +
                "  'title':    'Java Puzzlers: Traps, Pitfalls, and Corner Cases',\n" +
                "  'isbn-10':  '032133678X',\n" +
                "  'isbn-13':  '978-0321336781',\n" +
                "  'authors':  ['Joshua Bloch', 'Neal Gafter']\n" +
                "}";


        Gson gson = new Gson();


        dataPayload = gson.fromJson(jsonStr, JsonObject.class);
        String  parseStr = dataPayload
            .get(PARSER).getAsString();
        JsonObject tsJSONObj = dataPayload
                .get(MDTSDB_ROOT).getAsJsonObject();
        JsonObject swlJSONObj = dataPayload
                .get(MDTSDB_ROOT).getAsJsonObject()
                .get(SWL_ROOT).getAsJsonObject();
        JsonObject kfJSONObj = dataPayload
                .get(KAFKA_ROOT).getAsJsonObject();

       //System.out.println(parseStr.toString());
        //System.out.println(tsJSONObj.toString());
        //System.out.println(kfJSONObj.toString());



        //Time Series DataBase
        JsonElement clAdmKeyEl = tsJSONObj.get("clAdmKey");
        String clAdmKey = clAdmKeyEl.getAsString();
        JsonElement clAdmKeySecretEl = tsJSONObj.get("clAdmSecretKey");
        String clAdmKeySecret = clAdmKeySecretEl.getAsString();
        System.out.println("clAdmKey : " + clAdmKey);
        System.out.println("clAdmSecretKey" + clAdmKeySecret);

        //Swimlane
        JsonElement swlNameEl = swlJSONObj.get("name");
        String name  = swlNameEl.getAsString();
        JsonElement appKeyEl = swlJSONObj.get("appKey");
        String appKey = appKeyEl.getAsString();
        JsonElement secretKeyEl = swlJSONObj.get("secretKey");
        String secretKey = secretKeyEl.getAsString();

        System.out.println("Swl Name : " + name);
        System.out.println("App Key : " + appKey);
        System.out.println("Secret Key : " + secretKey);

        //Kafka
        JsonElement topicEl = kfJSONObj.get("topic");
        String topic = topicEl.getAsString();
        System.out.println("Kafka topic : " + topic);
        JsonElement groupEl = kfJSONObj.get("group");
        String group = groupEl.getAsString();
        System.out.println("Kafka consumer group : " + group);
        JsonElement brokerEl = kfJSONObj.get("broker");
        String broker = brokerEl.getAsString();
        System.out.println("Kafka Broker :" +  broker);
        JsonElement nThreadsEl = kfJSONObj.get("numThreads");
        Long numThreads = nThreadsEl.getAsLong();
        System.out.println("Number of threads : " + numThreads);



    }
}
