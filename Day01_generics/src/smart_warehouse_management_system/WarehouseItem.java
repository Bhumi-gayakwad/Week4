package smart_warehouse_management_system;

public abstract class WarehouseItem {
    private String name;
    private int price;
    private int quantity;
    private ItemType itemType;

    WarehouseItem(String name, int price, int quantity, ItemType itemType){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.itemType = itemType;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getItemType(){
        return this.itemType.name();
    }

    public int totalPrice(){
        return (price * quantity);
    }
}

