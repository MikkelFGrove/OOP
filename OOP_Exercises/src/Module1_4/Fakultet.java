public class Fakultet {

	
	public static int fakultetCal(int num){
		if (num == 1) {
			return 1;
		}
		return num * fakultetCal(num-1);
	}

	public static void main(String[] args) {
		System.out.println(fakultetCal(4));
	}
}