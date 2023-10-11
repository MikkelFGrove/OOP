package Module2_5.Lagersystem;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        FoodItem[] fItems = new FoodItem[10];

        for (int i = 0; i < fItems.length; i++) {
            fItems[i] = new FoodItem("Item "+1, 12.3*i,
                    new Date(i*1000*60*60*24));
            inventory.addItem(fItems[i]);

        }
        NonFoodItem[] nItems = new NonFoodItem[10];

        for (int i=0 ; i<nItems.length ; i++) {
            ArrayList<String> materials = new ArrayList<>();
            materials.add("Butter");
            materials.add("Cream");

            nItems[i] = new NonFoodItem("Item "+i, 12.3*i, materials);
            inventory.addItem(nItems[i]);
        }
        inventory.printInventory();
        System.out.println(inventory.getInventoryValue());
    }
}
