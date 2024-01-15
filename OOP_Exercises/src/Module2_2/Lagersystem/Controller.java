package Module2_2.Lagersystem;

public class Controller {
    public static void main(String[] args) {
        FoodItem[] foodArray = new FoodItem[10];

        for (int i = 0; i < 10; i++) {
            foodArray[i] = new FoodItem("hello", 15);
        }

        for (int i = 0; i < 10; i++){
            System.out.println(foodArray[i].toString());
        }
    }
}
