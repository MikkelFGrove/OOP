package Module1_5.Sten_Saks_Papir;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sten_Sags_Papir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        int player_number, computer_number;

        while (true) {
            // human play
            System.out.println("Please enter your choice of rock (0), paper (1) or scissors (2):");
            try {
                player_number = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Pls pick an int " +ex);
                break;
            }
            if (player_number > 2 || player_number < 0) {
                System.out.println("Pls pick a number between 0 and 2");
                break;
            }

            System.out.println("Player plays " + choices[player_number]);

            // computer play
            computer_number = (int) (Math.random() * 3);
            System.out.println("Computer plays " + choices[computer_number]);

            // outcome
            switch (10 * player_number + computer_number) {
                case 00:
                case 11:
                case 22:
                    System.out.println("That's a draw!");
                    break;

                case 02:
                case 10:
                case 21:
                    System.out.println("You win!");
                    break;

                case 20:
                case 01:
                case 12:
                    System.out.println("You loose!");
                    break;

                default:
                    System.out.println("Internal error :-(");
                    System.out.println("- Player chose:" + player_number);
                    System.out.println("- Computer chose:" + computer_number);
            }
            System.out.println("Let's play again ...");
        }
    }
}

