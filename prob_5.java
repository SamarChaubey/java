import java.util.*;
public class prob_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input value
        int w = scanner.nextInt();  // weight of the watermelon

        // Close the scanner
        scanner.close();

        // Check if it's possible to divide w into two even parts
        if (w >= 4 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
