package Module1_5.Indeksering;

public class Indeksering {
    public static void main(String[] args) {
        int iterationer = 10;
        int[] array = {1,2,3,4,5};

        // increment
        for(int i = 0; i < iterationer; i++){
            try {
                array[i]++;
            } catch (ArrayIndexOutOfBoundsException e){
            }

        }

        // print
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
