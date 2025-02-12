package personalized_meal_plan_generator;
import personalized_meal_plan_generator.meal.Meal;
import personalized_meal_plan_generator.meal.meal_plan.HighProteinMeal;
import personalized_meal_plan_generator.meal.meal_plan.MealPlan;
import personalized_meal_plan_generator.meal.meal_plan.VeganMeal;
import personalized_meal_plan_generator.meal.meal_plan.VegetarianMeal;

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {

        System.out.println("Create meal with vegan meal as generic type parameter");
        Meal<VeganMeal> veganMeals = new Meal<>();
        veganMeals.addMeal(new VeganMeal("tofu soup", 1000));
        veganMeals.addMeal(new VeganMeal("tofu curry", 2000));
        veganMeals.displayMealDetails();

        System.out.println();

        System.out.println("Create meal with meal plan interface as generic type parameter");
        Meal<MealPlan> allMeals = new Meal<>();
        allMeals.addMeal(new VeganMeal("tofu", 1000));
        allMeals.addMeal(new VegetarianMeal("butter paneer", 2000));
        allMeals.addMeal(new HighProteinMeal("butter chicken", 3000));
        allMeals.displayMealDetails();


    }
}

