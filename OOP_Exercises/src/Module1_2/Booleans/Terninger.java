package Module1_2.Booleans;

public class Terninger {
    public static void main(String[] args) {

        // Initializing variable
        int dice = 5;

        // Checks if dice is bigger than 3 and if it is even
        boolean evenNBig = dice > 3 && dice % 2 == 0;

        // Prints out the result of evenNBig
        System.out.println(evenNBig);
    }
}
