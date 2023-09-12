package Module1_2.Loops;

public class PrimeNumber {
    public static void main(String[] args) {
        //Initializing variables
        int limit = 1000000;
        int largestPrime = 0;

        //Outer for-loop runs through all the numbers from 3 to 1000000
        for (int num = 3; num <= limit; num++) {

            //Every number gets as default set as isPrime = true
            boolean isPrime = true;

            //Nested for-loop starts by setting the divisor, or the number that is checking if it adds evenly up
            //The for-loop only checks up to the square root of the number its checking to optimize the program
            //It then checks if the divisor evenly adds up to the divisor
            //If so, it sets isPrime = false and breaks out of the for-loop
            for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            //If isPrime is true, then it updates the largestPrime to this number
            if (isPrime) {
                largestPrime = num;
            }
        }
        //When all the numbers has run through then it prints out largestPrime's value
        System.out.println("The largest prime number up to " + limit + " is: " + largestPrime);

    }
}
