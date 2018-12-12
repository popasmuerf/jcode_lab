package design_patterns.builder.pojo;

import design_patterns.builder.abstr.Burger;

/**
 * Created by mdb on 7/30/18.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
