package dynamic_online_marketplace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DynamicOnlineMarketplaceTest {

    @Test
    void testOnlineMarketplace(){
        // arrange
        String productName = "Oliver twist";
        int productPrice = 300;

        // act
        Product<BookCategory> productOfTypeBook = new Product<>(productName, productPrice, new BookCategory());

        // assertion
        Assertions.assertEquals(productName, productOfTypeBook.getName());
        Assertions.assertEquals(productPrice, productOfTypeBook.getPrice());
    }

}
