package Module2_2.Lagersystem;

public class NonFoodItem extends Item{
    private String[] materials;

    NonFoodItem (String name, double price, String[] materials) {
        super(name, price);
        this.materials = materials;
    }

    public String[] getMaterials() {
        return materials;
    }

    @Override
    public String toString() {
        StringBuilder m = new StringBuilder("[");
        for (int i=0 ; i<materials.length ; i++) {
            m.append(i == 0 ? "" : ",").append(materials[i]);
        }
        m.append("]");
        return "NonFoodItem name='"+getName()
                + "' price='"+getPrice()
                + "' materials='"+m+"'";

    }
}
