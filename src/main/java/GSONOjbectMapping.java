import com.google.gson.Gson;

/**
 * Created by mdb on 12/10/17.
 */
public class GSONOjbectMapping {
    public static void main(String args[]){
        Gson gson = new Gson() ;
        Student student = new Student() ;
        student.setAge(10);
        student.setName("Mahesh");

        String jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }
}
