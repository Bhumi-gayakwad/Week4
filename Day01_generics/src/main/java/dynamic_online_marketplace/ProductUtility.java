package dynamic_online_marketplace;

public class ProductUtility {

    public static <T extends Product<?>> void displayDetails(T product){
        System.out.println("Name: "+product.getName()+", Its price: "+product.getPrice()+", Its category: "+product.getCategory());
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage){
        product.applyDiscount(percentage);
    }
}
