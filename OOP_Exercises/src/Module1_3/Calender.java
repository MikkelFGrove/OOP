package Module1_3;

public class Calender {
	public static void main(String[] args) {
		int[] monthNorm = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] monthLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for (int year=2000; year < 2021; year++) {
			int[] month = (year % 4==0 ? monthLeap : monthNorm);

			for (int i : month){
				System.out.print(i + " ");
			}
			System.out.println("");

		}
	}
}