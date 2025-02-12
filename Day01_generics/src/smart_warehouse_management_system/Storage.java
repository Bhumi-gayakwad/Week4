package smart_warehouse_management_system;

import java.util.ArrayList;
import java.util.List;
public class Storage  <T extends WarehouseItem> {
    private static int storageNumber;

    static {
        storageNumber = 0;
    }

    private String storageId;
    private List<T> warehouseItems;

    Storage(){
        this.storageId = "STORAGE_ID_" + (++storageNumber);
        this.warehouseItems = new ArrayList<>();
    }

    public void addItem(T item){
        this.warehouseItems.add(item);
    }

    public List<T> getItems(){
        return warehouseItems;
    }

}

