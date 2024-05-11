import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N value
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Read matrix
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline
        }

        // Check reachability
        boolean canReach = isReachable(matrix, N);

        // Print result
        if (canReach) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    private static boolean isReachable(int[][] matrix, int N) {
        int row = 0;
        int col = 0;
        while (row < N && col < N) {
            if (matrix[row][col] == 0) {
                return false;
            }
            if (row == N - 1 && col == N - 1) {
                return true;
            }
            if (row + 1 < N && matrix[row + 1][col] == 1) {
                row++;
            } else if (col + 1 < N && matrix[row][col + 1] == 1) {
                col++;
            } else {
                return false;
            }
        }
        return false;
    }
}
