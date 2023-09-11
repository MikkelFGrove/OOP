package Module1_1.Variables;

public class Epoch {
    public static void main(String[] args) {
        int secondsPassed = 1694103015;

        int minutesPassed = secondsPassed / 60;

        int hoursPassed = minutesPassed / 60;

        int daysPassed = hoursPassed / 24;

        int yearsPassed = daysPassed / 365;

        int restDays = daysPassed % 365;

        System.out.print("Since the date 1970 1 January there have passed " + yearsPassed + " years");
        System.out.println(" and " + restDays + " days");


    }
}
