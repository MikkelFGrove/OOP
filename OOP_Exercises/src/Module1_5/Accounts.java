package Module1_5;

import java.util.Scanner;

public class Accounts {
    static Scanner scanner = new Scanner(System.in);
    static int[] accounts = {903, 716, 57};

    static int getAccountNumber(){
        System.out.println("Enter an account number: ");
        return scanner.nextInt();
    }

    static void printAccountState(int accountid){
        System.out.println("Account " + accountid + " contains " + accounts[accountid]);
    }

    public static void main(String[] args) {
        while(true){
            int accountid = getAccountNumber();

            try {
                printAccountState(accountid);
            }catch (Exception ArrayIndexOutOfBoundsException){
                System.out.println("Not a valid account id unlucky");
            }

        }
    }

}
