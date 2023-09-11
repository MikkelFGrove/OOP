package Module1_2.Loops;

public class CelciusToFahrenheit {
    public static void main(String[] args) {

        for (double celcius =  40 ; celcius > -5 ; celcius-= .5){
            System.out.printf("%.2f %.2f\n" ,celcius, (32 +9/5 * celcius));

        }
    }
}
