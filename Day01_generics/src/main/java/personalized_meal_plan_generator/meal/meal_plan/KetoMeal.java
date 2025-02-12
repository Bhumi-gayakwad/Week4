package personalized_meal_plan_generator.meal.meal_plan;

public class KetoMeal implements MealPlan {

    public String name;
    public int price;

    public KetoMeal(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public void displayMealDetail(){
        System.out.println("Meal name: "+this.name+" and its price is "+this.price);
    }

}
