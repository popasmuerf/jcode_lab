package design_patterns.builder.pojo;

/**
 * Created by mdb on 7/30/18.
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
