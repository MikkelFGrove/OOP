package Module2_5.Lagersystem;

import java.util.Date;

public class NonFoodItem extends Item{
    private String[] materials;
    NonFoodItem (String name, double price, String[] materials){
        super(name, price);
        this.materials = materials;
    }

    public String[] getMaterials (){
        return materials;
    }

    @Override
    public String toString (){
        String m = "[";
        for (int i = 0; i < materials.length; i++) {
            m += (i==0 ? "" : ",") + materials[i];
        }
        m += "]";
        return "NonFoodItem name ='" + getName()
                + "' price='" + getPrice()
                + "' materials='" + m + "'";
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        NonFoodItem[] items = new NonFoodItem[10];
        FoodItem[] items = new FoodItem[10];

        for (int i = 0; i < items.length; i++) {
            items[i] = new FoodItem("Item "+1, 12.3*i,
                    new Date(i*1000*60*60*24));
        }

        for (int i=0 ; i<items.length ; i++) {
            items[i] = new NonFoodItem("Item "+i, 12.3*i,
                                        new String[] {"butter", "cream"});
            inventory.addItem(items[i]);
        }
        for (NonFoodItem item: items){
            System.out.println(item);
        }
    }
}
