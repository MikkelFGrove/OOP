package Module1_2.Loops;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean is_prime;

        for (int i=3 ; i<100 ; i++){
            for (int j=1 ; j<i ; j++){
                if(i%j == 0){
                    is_prime = false;
                }else break;
                System.out.println(is_prime);
            }
        }
    }
}
