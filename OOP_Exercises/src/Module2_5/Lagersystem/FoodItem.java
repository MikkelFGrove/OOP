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

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        FoodItem[] items = new FoodItem[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = new FoodItem("Item "+i, 12.3*i,
                                        new Date(i*1000*60*60*24));
            inventory.addItem(items[i]);
        }


        inventory.removeExpiredFoods();

        inventory.printInventory();
    }

    @Override
    public boolean isExpired() {
        if (currentDate.before(expires)){
            return true;
        } else return false;
    }
}
