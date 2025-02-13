package shopping_cart;
import java.util.*;

public class ShoppingCart {
    Map<String, Double> productPrices = new HashMap<>();
    Map<String, Double> cart = new LinkedHashMap<>();
    Map<Double, String> sortedCart = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void addToCart(String product) {
        if (productPrices.containsKey(product)) {
            double price = productPrices.get(product);
            cart.put(product, price);
            sortedCart.put(price, product);
        }
    }

    public void displayCart() {
        System.out.println("Cart Items (Ordered by Addition): " + cart);
    }

    public void displaySortedCart() {
        System.out.println("Cart Items (Sorted by Price): " + sortedCart);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Laptop", 1200);
        cart.addProduct("Phone", 800);
        cart.addProduct("Headphones", 200);

        cart.addToCart("Phone");
        cart.addToCart("Laptop");
        cart.addToCart("Headphones");

        cart.displayCart();
        cart.displaySortedCart();
    }
}

