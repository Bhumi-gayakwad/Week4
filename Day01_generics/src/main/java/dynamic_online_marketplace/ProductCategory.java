package dynamic_online_marketplace;

public class ProductCategory {

    private Category categoryName;

    public String getCategory(){
        return categoryName.name();
    }

    ProductCategory(Category categoryName){
        this.categoryName = categoryName;
    }

}
