package Module1_2.Loops.CelciusToFahrenheit3;

public class Alternative2 {
    public static void main(String[] args) {

        // Runs through every half step of celcius and prints out the corresponding Fahrenheit temp
        double celcius = -5;
        do{
            System.out.printf("%.2f %.2f\n" ,celcius, (32 +9/5 * celcius));
            celcius += .5;
        }
        while(celcius <= 40);
    }
}
