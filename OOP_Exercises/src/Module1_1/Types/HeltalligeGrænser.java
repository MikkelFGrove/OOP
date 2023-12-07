package Module1_1.Types;

public class HeltalligeGrænser {
    // 1. Hvilke heltallige datatyper kan man benytte sig af i Java?
    //          byte, short, int og long

    // Skriv et program der eksperimentelt afslører hvad der sker når man overskrider den størst mulige værdi.
    public static void main(String[] args) {
        int i = 2147483647;
        i++;
        System.out.println(i);
    }

    // Beskriv hvad det er I observerer?
    //          Tallet bliver negativt og begynder at inkrimentere opad fra -2147483647
}
