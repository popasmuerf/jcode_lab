package design_patterns.builder.builders;

import design_patterns.builder.pojo.*;

/**
 * Created by mdb on 7/30/18.
 */
public class MealBuilder {
   public Meal prepareVegMeal(){
       Meal meal = new Meal() ;
       meal.addItem(new VegBurger());
       meal.addItem(new Coke());
       return meal ;
   }
   public Meal prepareNonVegMeal(){
       Meal meal = new Meal();
       meal.addItem(new ChickenBurger());
       meal.addItem(new Pepsi());
       return meal;
   }

}
