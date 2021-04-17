package in.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MatrixApp {
	public static void main(String[] args) throws Exception {
		System.out.println(
				printEmptyCellsCount(5, 2, Arrays.asList("1,2", "3,4")));
	}

	public static int printEmptyCellsCount(int n, int k,
			List<String> coordinates) throws Exception {

		int[][] matrix = new int[n][n];

		for (String coordinate : coordinates) {
			String[] markedCells = coordinate.split(",");
			
			if (markedCells.length != 2)
				throw new Exception("Invalid Input Provided");
			
			for (int i = 0; i < n; i++) {
				matrix[Integer.parseInt(markedCells[0])][i] = 1;
				matrix[i][Integer.parseInt(markedCells[1])] = 1;
			}
		}
		
		// System.out.println(Arrays.deepToString(matrix));

		return (int) Arrays.stream(matrix).flatMapToInt(Arrays::stream)
				.filter(val -> val == 0).count();
	}
}
