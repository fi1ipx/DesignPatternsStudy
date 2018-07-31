import com.fi1.Meal;
import com.fi1.MealBuilder;
import org.junit.Assert;
import org.junit.Test;

public class BuilderPatternDemo {
    private static final double DELTA = 1e-15;

    @Test
    public void builderPatternTest() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        Assert.assertEquals(55.5f, vegMeal.getCost(), DELTA);
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        Assert.assertEquals(82.0f, nonVegMeal.getCost(), DELTA);
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
