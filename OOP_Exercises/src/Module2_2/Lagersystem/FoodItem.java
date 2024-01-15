package Module2_2.Lagersystem;

import java.util.Date;

public class FoodItem extends Item{
    private Date expires;

    @Override
    public String toString() {
        return (getName() + " " + getPrice() + " " + expires.toString());

    }
}
