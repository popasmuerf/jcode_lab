package types;

/**
 * Created by mdb on 6/2/18.
 */
public class Transformer {
    private final String designation ;

    public Transformer(String designation){
        this.designation = designation ;
    }
    @Override
    public String toString(){
        return "{designation : " + designation + "}" ;
    }
}
