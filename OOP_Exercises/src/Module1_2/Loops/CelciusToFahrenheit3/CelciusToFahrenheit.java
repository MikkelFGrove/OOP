package Module1_2.Loops.CelciusToFahrenheit3;

public class CelciusToFahrenheit {
    public static void main(String[] args) {

        // Runs through every half step of celcius and prints out the corresponding Fahrenheit temp
        for (double celcius =  -5; celcius <= 40 ; celcius+= .5){
            System.out.printf("%.2f %.2f\n" ,celcius, (32 +9/5 * celcius));

        }
    }
}
