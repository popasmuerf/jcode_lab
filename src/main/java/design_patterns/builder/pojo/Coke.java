package design_patterns.builder.pojo;

import design_patterns.builder.interfaces.Item;
import design_patterns.builder.interfaces.Packing;

/**
 * Created by mdb on 7/30/18.
 */
public class Coke  extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
