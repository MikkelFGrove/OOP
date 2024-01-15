package Module1_3;

public class AreaOfCircleArray {
	public static void main(String[] args) {
		int[] radius = {1, 3, 5};

		for (int i : radius) {
			double area = Math.PI * i * i;
			System.out.println(area);
		}

	}
}