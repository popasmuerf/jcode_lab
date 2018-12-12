package java_core.oop._abstract.lab0;

/**
 * Created by mdb on 6/22/18.
 */
public abstract class  BaseEntity<T> extends Entity<T> {
    T _id ;
    String _name ;

    BaseEntity(T id, String name){
        super.id = id ;
        super.name = name ;
        this._id = super.id ;
        this._name = super.name ;
    }


    public T getId(){
        return _id ;
    }

    public void setId(T id){
        this.id = _id ;
    }

    public void setName(String name){
        this._id = _id ;
    }
    public String  getName(){
        return this._name ;
    }

}
