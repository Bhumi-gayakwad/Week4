package personalized_meal_plan_generator.meal;

import personalized_meal_plan_generator.meal.meal_plan.MealPlan;

import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan> {

    List<T> meals;

    public Meal(){
        meals = new ArrayList<>();
    }

    public void addMeal(T meal){
        meals.add(meal);
    }

    public List<T> getMeals(){
        return this.meals;
    }

    public void displayMealDetails(){
        for (MealPlan meal : meals){
            meal.displayMealDetail();
        }
    }

}
