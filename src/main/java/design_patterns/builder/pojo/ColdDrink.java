package design_patterns.builder.pojo;

import design_patterns.builder.interfaces.Item;
import design_patterns.builder.interfaces.Packing;

/**
 * Created by mdb on 7/30/18.
 */
public abstract class ColdDrink  implements Item {
    @Override
    public String name() {
        return null;
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float price() {
        return 0;
    }
}
