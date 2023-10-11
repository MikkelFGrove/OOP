package Module2_5.Lagersystem;

import java.util.ArrayList;
import java.util.Date;

public class NonFoodItem extends Item{
    private ArrayList<String> materials = new ArrayList<>();
    NonFoodItem (String name, double price, ArrayList materials){
        super(name, price);
        this.materials = materials;
    }

    public ArrayList<String> getMaterials (){
        return materials;
    }

    @Override
    public String toString (){
        String m = "[";
        for (int i = 0; i < materials.size(); i++) {
            m += (i==0 ? "" : ",") + materials.get(i);
        }
        m += "]";
        return "NonFoodItem name ='" + getName()
                + "' price='" + getPrice()
                + "' materials='" + m + "'";
    }
}
