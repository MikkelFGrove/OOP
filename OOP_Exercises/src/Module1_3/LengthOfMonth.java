package Module1_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LengthOfMonth {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter the month number to get the days: ");

        int monthNumber;
        while (true) {
            try {
                monthNumber = myScanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                myScanner.nextLine(); // Consume the invalid input
                System.out.println("Please enter a valid number");
                System.out.print("Enter the month number to get the days: ");
            }
        }

        try {
            final int MONTH_INDEX = monthNumber - 1;
            System.out.println("Days in month: " + daysInMonth[MONTH_INDEX]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The number can only be between 1 and 12");
        } finally {
            myScanner.close();
        }
    }
}

