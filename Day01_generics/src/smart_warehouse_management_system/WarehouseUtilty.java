package smart_warehouse_management_system;
import java.util.List;

public class WarehouseUtilty {
    public static void listItems(List<? extends WarehouseItem> warehouseItems){
        for (WarehouseItem item : warehouseItems){
            System.out.println("Item type: "+item.getItemType()+", Name: "+item.getName()+", Its total price: "+item.totalPrice());
        }
    }
}

