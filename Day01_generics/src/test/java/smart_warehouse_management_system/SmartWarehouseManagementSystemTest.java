package smart_warehouse_management_system;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartWarehouseManagementSystemTest {

    @Test
    void testFurnitureClassCreation(){
        // arrange
        String furnitureName = "Wooden table";
        int furniturePrice = 2500;
        int furnitureQuantity = 8;

        // act
        Furniture table = new Furniture(furnitureName, furniturePrice, furnitureQuantity);

        // assertion
         Assertions.assertEquals(furnitureName, table.getName());
         Assertions.assertEquals(furniturePrice, table.getPrice());
         Assertions.assertEquals(furnitureQuantity, table.getQuantity());
         Assertions.assertEquals(ItemType.FURNITURE.name(), table.getItemType());
    }

    @Test
    void testElectronicClassCreation(){
        // arrange
        String electronicName = "Mac Book";
        int electronicPrice = 250000;
        int electronicQuantity = 15;

        // act
        Electronic item = new Electronic(electronicName, electronicPrice, electronicQuantity);

        // assertion
        Assertions.assertEquals(electronicName, item.getName());
        Assertions.assertEquals(electronicPrice, item.getPrice());
        Assertions.assertEquals(electronicQuantity, item.getQuantity());
        Assertions.assertEquals(ItemType.ELECTRONIC.name(), item.getItemType());
    }

    @Test
    void testGroceryClassCreation(){
        // arrange
        String groceryName = "Sugar Packet";
        int groceryPrice = 500;
        int groceryQuantity = 25;

        // act
        Grocery table = new Grocery(groceryName, groceryPrice, groceryQuantity);

        // assertion
        Assertions.assertEquals(groceryName, table.getName());
        Assertions.assertEquals(groceryPrice, table.getPrice());
        Assertions.assertEquals(groceryQuantity, table.getQuantity());
        Assertions.assertEquals(ItemType.GROCERY.name(), table.getItemType());
    }

}
