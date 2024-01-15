package Module2_2.Lagersystem;

import java.util.Date;

public class FoodItem extends Item{
    private Date expires = new Date();

    public FoodItem(String name, double price) {
        super(name, price);
    }

    public Date getExpires(){
        return expires;
    }

    @Override
    public String toString() {
        return "Food item name: '" + getName() + "' price: '" + getPrice() + "' expire date: '" + expires.toString();

    }
}
