package Module2_4.Adder;

public class Controller {
    static String solve(int x, int y){
        int z = x + y;
        return x + " " + y + " = " + z;
    }

    static String solve(double x, double y){
        double z = x + y;
        return x + " " + y + " = " + z;
    }

    public static void main(String[] args) {
        System.out.println(solve(19, 11));
        System.out.println(solve(19.4, 12));

    }
}
