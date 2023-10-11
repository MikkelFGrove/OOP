package Module2_4.Date;
import java.util.Date;
public class Main {

    public static void main(String[] args) {

        for (int i = 1000; i < 1000001; i *= 10) {
            Date date = new Date(i);
            System.out.println(date.toString());
        }

    }

}
