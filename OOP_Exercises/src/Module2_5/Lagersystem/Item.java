package Module2_5.Lagersystem;

abstract class Item implements Expireable{
    private String name;
    private double price;

    Item (String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }
}
