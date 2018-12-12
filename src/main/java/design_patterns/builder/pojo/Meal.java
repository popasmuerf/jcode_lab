package design_patterns.builder.pojo;

import design_patterns.builder.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mdb on 7/30/18.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>() ;
    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost = 0.0f ;
        for(Item item:items){
            cost += item.price() ;
        }
        return cost ;
    }
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
