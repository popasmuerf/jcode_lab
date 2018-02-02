import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

/**
 * Created by mdb on 12/8/17.
 */



public class GSONBasics {
    String json0 = "{\"name\":\"Mahesh\", \"age\":21}";
    String json1 = "{\n" +
            "  'title':    'Java Puzzlers: Traps, Pitfalls, and Corner Cases',\n" +
            "  'isbn-10':  '032133678X',\n" +
            "  'isbn-13':  '978-0321336781',\n" +
            "  'authors':  ['Joshua Bloch', 'Neal Gafter']\n" +
            "}";
    public static void main(String args[]){
        String json0 = "{\"name\":\"Mahesh\", \"age\":21}";
        String json1 = "{\n" +
                "  'title':    'Java Puzzlers: Traps, Pitfalls, and Corner Cases',\n" +
                "  'isbn-10':  '032133678X',\n" +
        "  'isbn-13':  '978-0321336781',\n" +
                "  'authors':  ['Joshua Bloch', 'Neal Gafter']\n" +
                "}";

        try{
            Student student = new Student() ;
            student.setAge(10);
            student.setName("Mahesh");
            writeJSON(student);
            Student student1 = readJson();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create() ;
        Student student = gson.fromJson(json0,Student.class);
        String studentJson = gson.toJson(student);
        System.out.println(studentJson);
        */
    }
    private static void  writeJSON(Student student)throws IOException{
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create() ;
        FileWriter writer = new FileWriter("student.json");
        writer.write(gson.toJson(student));
    }
    private static Student readJson()throws FileNotFoundException {
        GsonBuilder builder = new GsonBuilder() ;
        Gson gson = builder.create();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("student.json"));

        Student student = gson.fromJson(bufferedReader,Student.class);
        return student;
    }



}
