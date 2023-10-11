package Module2_4.Tidstagning;

public class Timing {
    static double fun(double x, double y){
        if (y <= 1) {
            return Math.pow(x,y);
        } else {
            return fun(x,y-1) * fun(x,y-1);
        }
    }
}
