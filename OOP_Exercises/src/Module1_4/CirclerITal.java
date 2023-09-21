public class CirclerITal {
	public static double area(int num){
		return num*num*3.14;
	}

	public static double circumference(int num){
		return num * 2 * 3.14;
	}

	public static void main(String[] args) {
		int[] array = {1, 3, 5};
		
		for (int i : array) {
			System.out.println(area(i) + " " + circumference(i));
		}
		
	}
}