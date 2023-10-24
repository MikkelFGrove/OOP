package Module2_5.Lagersystem;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();
    Inventory (ArrayList<Item> items) {
        this.items = items;
    }
    Inventory () {
        this(new ArrayList<Item>());
    }


    public void addItem(Item item){
        items.add(item);
    }


    public void removeItem(Item item){
            items.remove(item);

    }

    public void removeExpiredFoods(){
        ArrayList<Item> currentItems = new ArrayList<Item>();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            boolean expired = item.isExpired();
            if (!expired) {
                currentItems.add(item);
            }
        }
        items = currentItems;
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
