package dynamic_online_marketplace;

public class Product<T extends ProductCategory> {
    private String name;
    private int price;
    private T category;

    Product(String name, int price, T category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public String getCategory(){
        return this.category.getCategory();
    }

    public void applyDiscount(double percentage){
        this.price -= (percentage * price / 100);
    }

}

