package Module2_5.Lagersystem;
import java.util.Date;
public class FoodItem extends Item {
    private Date expires;
    private Date currentDate = new Date(3*1000*60*60*24);

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

<<<<<<< HEAD
}
