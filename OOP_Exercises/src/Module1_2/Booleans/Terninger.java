package Module1_2.Booleans;

public class Terninger {
    public static void main(String[] args) {
        int dice = 5;
        boolean evenNBig = dice > 3 && dice % 2 == 0;
        System.out.println(evenNBig);
    }
}
