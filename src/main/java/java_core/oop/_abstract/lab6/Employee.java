package java_core.oop._abstract.lab6;

/**
 * Created by mdb on 6/23/18.
 */
public class Employee extends Person {
    private int empId ;
    public Employee(String name, String gender,int id){
        super(name,gender);
        this.empId = id ;
    }
    @Override
    public void work(){
        if(empId == 0){
            System.out.println("Not working");
        }else{
            System.out.println("Working as employee!!");
        }
    }
}
