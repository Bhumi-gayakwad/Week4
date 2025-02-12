package dynamic_online_marketplace;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {

        Product<BookCategory> productOfTypeBook = new Product<>("Oliver twist", 300, new BookCategory());
        Product<ClothingCategory> productOfTypeCloth = new Product<>("Shirt", 700, new ClothingCategory());

        ProductUtility.displayDetails(productOfTypeBook);
        ProductUtility.applyDiscount(productOfTypeBook, 50);
        ProductUtility.displayDetails(productOfTypeBook);

    }
}
