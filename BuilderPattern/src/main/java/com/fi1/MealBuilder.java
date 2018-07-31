package com.fi1;

import com.fi1.burgers.ChickenBurger;
import com.fi1.burgers.VegBurger;
import com.fi1.colddrinks.Coke;
import com.fi1.colddrinks.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
