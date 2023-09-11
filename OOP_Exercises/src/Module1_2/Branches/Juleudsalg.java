package Module1_2.Branches;

public class Juleudsalg {
    public static void main(String[] args) {
        int secondsSinceNewyear = 30816000;
        double price = 599.95;
        int daysSinceNewyear = secondsSinceNewyear/60/60/24;

        if (daysSinceNewyear > 335 && daysSinceNewyear < 358) {
            double christmasDiscount = price * 0.3;
            double christmasPrice = price - christmasDiscount;
            System.out.println("You are very lucky you get " + christmasDiscount + "kr off your final price" +
                    " for a total of " + christmasPrice +"kr");
        } else System.out.println("You need to pay " + price + " kr");




    }


}
