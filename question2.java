import java.util.*;

class question2 {

	
	static void setZeroes(int[][] matrix)
	{

		int rows = matrix.length;
		int cols = matrix[0].length;

		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				
				if (matrix[i][j] == 1) {

					
					int ind = i - 1;
					while (ind >= 0) {
						if (matrix[ind][j] != 1) {
							matrix[ind][j] = -1;
						}
						ind--;
					}
					ind = i + 1;
					while (ind < rows) {
						if (matrix[ind][j] != 1) {
							matrix[ind][j] = -1;
						}
						ind++;
					}

					
					ind = j - 1;
					while (ind >= 0) {
						if (matrix[i][ind] != 1) {
							matrix[i][ind] = -1;
						}
						ind--;
					}
					ind = j + 1;
					while (ind < cols) {
						if (matrix[i][ind] != 1) {
							matrix[i][ind] = -1;
						}
						ind++;
					}
				}
			}
		}

		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] < 0) {
					matrix[i][j] = 1;
				}
			}
		}
	}


	public static void main(String[] args)
	{
		int[][] arr = { { 1, 0, 2, 1 },
						{ 3, 4, 5, 2 },
						{ 0, 3, 0, 5 } };
		setZeroes(arr);
		System.out.println("The Final Matrix is:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
