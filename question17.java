import java.util.Scanner;

public class question17 
    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read initial position
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Read number of movements
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Process movements
        for (int i = 0; i < n; i++) {
            String movement = scanner.next();
            switch (movement) {
                case "U":
                    y++;
                    break;
                case "D":
                    y--;
                    break;
                case "L":
                    x--;
                    break;
                case "R":
                    x++;
                    break;
            }
        }

        // Print current position
        System.out.println(x + " " + y);

        scanner.close();
    }
}
