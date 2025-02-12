package smart_warehouse_management_system;

public class Electronic extends WarehouseItem {
    Electronic(String name, int price, int quantity){
        super(name, price, quantity, ItemType.ELECTRONIC);
    }
}
