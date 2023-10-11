package Module2_5.Lagersystem;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
        System.out.println("Item: " + item.getName());
    }

    public void removeItem(Item item){
        int i = items.indexOf(item);
        if (i == -1){
            System.out.println("Not an item!");
        } else{
            items.remove(i);
        }
    }

    public double getInventoryValue(){
        double value = 0;
        for (int i = 0; i < items.size(); i++) {
            value = value + items.get(i).getPrice();
        }
        return value;
    }

    public void printInventory(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).toString());
        }
    }
}
