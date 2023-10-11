package Module2_5.Lagersystem;
import java.util.Date;
public class FoodItem extends Item {
    private Date expires;

    FoodItem(String name, double price, Date expires){
        super(name, price);
        this.expires = expires;
    }

    public Date getExpires(){
        return expires;
    }
    @Override
    public String toString (){
        return "FoodItem name='"+getName()
                + "' price='"+getPrice()
                + "' expires='"+getExpires()+"'";
    }

}
