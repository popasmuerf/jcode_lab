import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Created by mdb on 12/10/17.
 */
/*

    https://www.tutorialspoint.com/gson/gson_tree_model.htm

    Tree Model prepares an in-memory tre
    representation of the JSON documents.
    It builds a tree of JsonObject nodes.
    It is a flexible approach and is analogous
    to DOM parser for XML
 */
public class GSONCreateTreeFromJSON {
    public static void main(String args[]){
        JsonParser parser = new JsonParser() ;
        String jsonString = "{\"name\":\"Mahesh Kumar\", \"age\":21,\"verified\":false,\"marks\": [100,90,85]}";
        JsonElement rootNode = parser.parse(jsonString);

        //Traversing the the Tree Model
        JsonObject details = rootNode.getAsJsonObject() ;
        JsonElement nameNode = details.get("name");
        System.out.println("Name: "+nameNode.getAsString());
    }
}
