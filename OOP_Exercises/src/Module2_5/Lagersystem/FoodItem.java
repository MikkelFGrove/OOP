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

    public static void main(String[] args) {
        FoodItem[] items = new FoodItem[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = new FoodItem("Item "+1, 12.3*i,
                                        new Date(i*1000*60*60*24));
        }

        for (FoodItem item: items) {
            System.out.println(item);
        }
    }
}
