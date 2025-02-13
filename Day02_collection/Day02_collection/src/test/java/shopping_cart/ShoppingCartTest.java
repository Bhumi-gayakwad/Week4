package shopping_cart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
        cart.addProduct("Laptop", 1200);
        cart.addProduct("Phone", 800);
        cart.addProduct("Headphones", 200);
    }

    @Test
    void testAddProduct() {
        cart.addProduct("Tablet", 500);
        Assertions.assertTrue(cart.productPrices.containsKey("Tablet"));
        Assertions.assertEquals(500, cart.productPrices.get("Tablet"));
    }

    @Test
    void testAddToCart() {
        cart.addToCart("Phone");
        Assertions.assertTrue(cart.cart.containsKey("Phone"));
        Assertions.assertEquals(800, cart.cart.get("Phone"));
    }

    @Test
    void testCartOrder() {
        cart.addToCart("Phone");
        cart.addToCart("Laptop");
        cart.addToCart("Headphones");

        List<String> expectedOrder = Arrays.asList("Phone", "Laptop", "Headphones");
        Assertions.assertEquals(expectedOrder, new ArrayList<>(cart.cart.keySet()));
    }

    @Test
    void testSortedCart() {
        cart.addToCart("Phone");
        cart.addToCart("Laptop");
        cart.addToCart("Headphones");

        List<String> expectedSortedOrder = Arrays.asList("Headphones", "Phone", "Laptop");
        Assertions.assertEquals(expectedSortedOrder, new ArrayList<>(cart.sortedCart.values()));
    }
}
