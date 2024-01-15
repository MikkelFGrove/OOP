package Module1_3;

public class BiggestInArray{
	public static void main(String[] args) {
		int[] arraySize = {10, 20, 23, 14, 124, 12, 56, 87};
		int biggestIndex = 0;
		
		for (int i=0; i < arraySize.length; i++) {
			int index;

			if (biggestIndex < arraySize[i]){
				index = i;
				biggestIndex = arraySize[i];
			}
		}

		System.out.println(biggestIndex);

	}
}