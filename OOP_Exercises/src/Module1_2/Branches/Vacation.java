package Module1_2.Branches;

public class Vacation {
    public static void main(String[] args) {
        int month = 8;
        switch (month) {
            case 10: System.out.println("Efterårsferie");
                break;
            case 12: System.out.println("Juleferie");
                break;
            case 4: System.out.println("Påskeferie");
                break;
            case 7, 8: System.out.println("Efterårsferie");
                break;
        }

    }
}
