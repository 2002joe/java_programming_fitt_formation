public class SubstringSearch {

    
    public static void searchSubstring(char[][] matrix, String substring) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int subLen = substring.length();

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - subLen; j++) {
                int k;
                for (k = 0; k < subLen; k++) {
                    if (matrix[i][j + k] != substring.charAt(k)) {
                        break;
                    }
                }
                if (k == subLen) {
                    System.out.println("Start index: <" + i + ", " + j + ">");
                    System.out.println("End index: <" + i + ", " + (j + subLen - 1) + ">");
                    return;
                }
            }
        }

        
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i <= rows - subLen; i++) {
                int k;
                for (k = 0; k < subLen; k++) {
                    if (matrix[i + k][j] != substring.charAt(k)) {
                        break;
                    }
                }
                if (k == subLen) {
                    System.out.println("Start index: <" + i + ", " + j + ">");
                    System.out.println("End index: <" + (i + subLen - 1) + ", " + j + ">");
                    return;
                }
            }
        }

        System.out.println("Substring not found.");
    }

    public static void main(String[] args) {
        char[][] matrix = {
            {'W', 'E', 'L', 'C', 'O'},
            {'M', 'E', 'T', 'O', 'Z'},
            {'O', 'H', 'O', 'C', 'O'},
            {'R', 'P', 'O', 'R', 'A'},
            {'T', 'I', 'O', 'n', ' '}
        };
        String substring = "TOO";
        searchSubstring(matrix, substring);
    }
}
