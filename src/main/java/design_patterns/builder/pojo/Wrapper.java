package design_patterns.builder.pojo;

import design_patterns.builder.interfaces.Packing;

/**
 * Created by mdb on 7/30/18.
 */
public class Wrapper implements Packing {
    @Override
    public String pack(){
        return "Wrapper";
    }
}
