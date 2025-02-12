package smart_warehouse_management_system;

public class Grocery extends WarehouseItem {
    Grocery(String name, int price, int quantity){
        super(name, price, quantity, ItemType.GROCERY);
    }

}
