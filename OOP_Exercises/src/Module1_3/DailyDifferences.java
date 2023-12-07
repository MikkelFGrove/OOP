package Module1_3;

public class DailyDifferences {
    public static void main(String[] args) {
        double[] temp = {21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9};
        double j = 0;


        for (double i : temp) {
            if (j != 0){
                System.out.printf("%.2f \n" ,(j - i) *-1);
            }

            j = i;
        }
    }
}
