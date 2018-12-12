package design_patterns.builder.abstr;

import design_patterns.builder.interfaces.Item;
import design_patterns.builder.interfaces.Packing;
import design_patterns.builder.pojo.Wrapper;

/**
 * Created by mdb on 7/30/18.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public  abstract  float price() ;
}
