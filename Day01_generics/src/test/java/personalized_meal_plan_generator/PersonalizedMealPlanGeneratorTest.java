package personalized_meal_plan_generator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import personalized_meal_plan_generator.meal.Meal;
import personalized_meal_plan_generator.meal.meal_plan.HighProteinMeal;
import personalized_meal_plan_generator.meal.meal_plan.MealPlan;
import personalized_meal_plan_generator.meal.meal_plan.VeganMeal;
import personalized_meal_plan_generator.meal.meal_plan.VegetarianMeal;
import smart_warehouse_management_system.Furniture;
import smart_warehouse_management_system.ItemType;

import java.util.ArrayList;
import java.util.List;

public class PersonalizedMealPlanGeneratorTest {

    @Test
    void testMealPlan(){
        // arrange
        String veganMealName = "tofu";
        String vegetarianMealName = "butter paneer";
        String highProteinMealName = "butter chicken";
        int veganMealPrice = 1000;
        int vegetarianMealPrice = 2000;
        int highProteinMealPrice = 3000;

        // act
        Meal<MealPlan> allMeals = new Meal<>();
        allMeals.addMeal(new VeganMeal(veganMealName, veganMealPrice));
        allMeals.addMeal(new VegetarianMeal(vegetarianMealName, vegetarianMealPrice));
        allMeals.addMeal(new HighProteinMeal(highProteinMealName, highProteinMealPrice));

        // assertion
        List<MealPlan> meals = allMeals.getMeals();
        Assertions.assertEquals(3, meals.size());
        Assertions.assertEquals(veganMealName, meals.get(0).getName());
        Assertions.assertEquals(veganMealPrice, meals.get(0).getPrice());
        Assertions.assertEquals(vegetarianMealName, meals.get(1).getName());
        Assertions.assertEquals(vegetarianMealPrice, meals.get(1).getPrice());
        Assertions.assertEquals(highProteinMealName, meals.get(2).getName());
        Assertions.assertEquals(highProteinMealPrice, meals.get(2).getPrice());
    }


}
