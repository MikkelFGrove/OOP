package Module1_2.Loops;

public class PrimeNumber {
    public static void main(String[] args) {
        int limit = 1000000;
        int largestPrime = 0;

        for (int num = 3; num <= limit; num++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                largestPrime = num;
            }
        }

        System.out.println("The largest prime number up to " + limit + " is: " + largestPrime);

    }
}
