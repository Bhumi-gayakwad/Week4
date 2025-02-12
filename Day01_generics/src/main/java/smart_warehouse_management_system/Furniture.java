package smart_warehouse_management_system;

public class Furniture extends WarehouseItem {

    Furniture(String name, int price, int quantity){
        super(name, price, quantity, ItemType.FURNITURE);
    }
}
