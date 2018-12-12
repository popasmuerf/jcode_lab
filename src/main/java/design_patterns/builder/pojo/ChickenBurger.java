package design_patterns.builder.pojo;

import design_patterns.builder.abstr.Burger;
import design_patterns.builder.interfaces.Item;
import design_patterns.builder.interfaces.Packing;

/**
 * Created by mdb on 7/30/18.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
