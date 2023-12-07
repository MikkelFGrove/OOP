package Module1_3;

public class AdditionTable {
    public static void main(String[] args) {
        int size = 30;
        int myArray[] = new int[size];
        for (int i = size -1; i >= 0; i--){
            myArray[i] = i * 3;
        }

        System.out.println(myArray[0]+ " " +myArray[1]+ " " +myArray[2]+ " " +myArray[3]);
    }
}
