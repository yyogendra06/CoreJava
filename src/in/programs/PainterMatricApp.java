package src.in.programs;

import java.util.stream.IntStream;

public class PainterMatricApp {
	public static void main(String[] args) {

		int n = 3;
		int m = 3;

		int[][] matrix = { { 2, 1, 3 }, { 5, 2, 3 }, { 4, 3, 2 } };

		int cost = 0;

		int previous_color = 0;
		for (int block = 0; block < n; block++) {
			if (block == 0) {

				previous_color = IntStream.range(0, matrix[block].length)
						.reduce((i, j) -> matrix[0][i] > matrix[0][j] ? j : i).getAsInt();

			} else {

				for (int colorIndex = 0; colorIndex < m - 1; colorIndex++) {
					int min = matrix[block][colorIndex];
					if (min > matrix[block][colorIndex + 1] && colorIndex != previous_color) {

						min = matrix[block][colorIndex + 1];

						if (colorIndex + 1 == m)
							previous_color = min;
					}
				}
				System.out.println(previous_color);

			}
			cost += matrix[block][previous_color];
		}

		System.out.println(cost);
	}

}
