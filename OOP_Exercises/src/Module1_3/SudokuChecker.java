public class SudokuChecker {
	public static void main(String[] args) {
		int problem = 0;
		int[][] sudokuPuzzle = 
			{
			{1, 2, 3, 6, 7, 8, 9, 4, 5}, 
			{5, 8, 4, 2, 3, 9, 7, 6, 1}, 
			{9, 6, 7, 1, 4, 5, 3, 2, 8}, 
			{3, 7, 2, 4, 6, 1, 5, 8, 9}, 
			{6, 9, 1, 5, 8, 3, 2, 7, 4}, 
			{4, 5, 8, 7, 9, 2, 6, 1, 3}, 
			{8, 3, 6, 9, 2, 4, 1, 5, 7}, 
			{2, 1, 9, 8, 5, 7, 4, 3, 6}, 
			{7, 4, 5, 3, 1, 6, 8, 9, 2}
			};


		// Check if filled
		for (int row = 0; row < sudokuPuzzle.length; row++) {
			for (int coloumn = 0; coloumn < sudokuPuzzle[row].length; coloumn++) {
				if (sudokuPuzzle[row][coloumn] == 0){
					problem = 1;
					break;
				}
			}
		}

		// Check if rows are correct
		for (int ; ; ) {
			
		}

		switch(problem){
			case 1: 
				System.out.println("Problem with If Filled");
		}

	}
}