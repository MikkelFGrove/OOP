package Module2_4.Tidstagning;

public class Main {
    public static void main(String[] args) {
        double x = 1.0000001;

        for (int y = 1; y < 33; y++) {
            long time = System.currentTimeMillis();
            System.out.println(time);
            System.out.println(y +" - " + Timing.fun(x, y) + " - " + (System.currentTimeMillis() - time));
        }

    }
}
