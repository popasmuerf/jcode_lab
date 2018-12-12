package java_core.oop._abstract.lab6;

/**
 * Created by mdb on 6/23/18.
 */
public abstract class Person {
    private String name ;
    private String gender ;

    public Person(String name, String gender){
        this.name = name ;
        this.gender = gender ;
    }
    public abstract void work() ;

    @Override
    public String toString(){
        return "Name="+this.name+"::Gender="+this.gender;
    }

    public void changeName(String name){
        this.name = name ;
    }
}
