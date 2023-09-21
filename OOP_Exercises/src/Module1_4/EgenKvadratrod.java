public class EgenKvadratrod{
	public static double kvadratrodeUdregner(double num){
		double max = 0;
		for (int i = 0; i < num; i++) {
			if (i*i > num) {max = i;
			break;
			}
		}

		for (double i = max-1; i < max; i += 0.000000001) {
			if (i*i > num) {
				return i - 0.000000001;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(kvadratrodeUdregner(127));
	}
}