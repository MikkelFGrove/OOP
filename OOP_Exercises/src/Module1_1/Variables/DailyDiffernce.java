package Module1_1.Variables;

public class DailyDiffernce {
    public static void main(String[] args) {
        float mondayT = 21.5f;
        float tuesdayT = 23.7f;
        float wednesdayT = 19.6f;
        float thursdayT = 22.5f;
        float fridayT = 25.3f;
        float saturdayT = 21.7f;
        float sundayT = 18.9f;

        float difference = mondayT - tuesdayT;
        System.out.println("The differnce in T between monday and tuesday is: " + difference);

        difference = tuesdayT - wednesdayT;
        System.out.println("The differnce in T between tuesday and wednesday is: " + difference);

        difference = wednesdayT - thursdayT;
        System.out.println("The differnce in T between wednesday and thursday is: " + difference);

        difference = thursdayT - fridayT;
        System.out.println("The differnce in T between thursday and friday is: " + difference);

        difference = fridayT - saturdayT;
        System.out.println("The differnce in T between friday and saturday is: " + difference);

        difference = saturdayT - sundayT;
        System.out.println("The differnce in T between saturday and sunday is: " + difference);

    }

}
