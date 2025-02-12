package smart_warehouse_management_system;

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {

        Furniture table = new Furniture("Wooden table", 2500, 1);
        Furniture chair = new Furniture("Gaming chair", 15000, 1);

        Electronic monitor = new Electronic("Samsung Curved Monitor", 20000, 1);

        Grocery sugarPacket = new Grocery("Sugar", 200, 2);
        Grocery saltPacket = new Grocery("Salt", 100, 2);
        Grocery almondPacket = new Grocery("Almond", 400, 1);

        System.out.println("Creation of furniture storage and its listing: ");
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(table);
        furnitureStorage.addItem(chair);
        WarehouseUtility.listItems(furnitureStorage.getItems());

        System.out.println("Creation of electronic storage and its listing: ");
        Storage<Electronic> electronicStorage = new Storage<>();
        electronicStorage.addItem(monitor);
        WarehouseUtility.listItems(electronicStorage.getItems());

        System.out.println("Creation of grocery storage and its listing: ");
        Storage<Grocery> groceryStorage = new Storage<>();
        groceryStorage.addItem(sugarPacket);
        groceryStorage.addItem(saltPacket);
        groceryStorage.addItem(almondPacket);
        WarehouseUtility.listItems(groceryStorage.getItems());

        System.out.println("Creation of total warehouse items storage and its listing: ");
        Storage<WarehouseItem> totalStorageOfAyush = new Storage<>();
        totalStorageOfAyush.addItem(table);
        totalStorageOfAyush.addItem(chair);
        totalStorageOfAyush.addItem(monitor);
        totalStorageOfAyush.addItem(sugarPacket);
        totalStorageOfAyush.addItem(saltPacket);
        totalStorageOfAyush.addItem(almondPacket);
        WarehouseUtility.listItems(totalStorageOfAyush.getItems());

    }
}
