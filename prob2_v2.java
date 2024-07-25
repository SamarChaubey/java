import java.util.Scanner;
abstract class prob2_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // Initialize max to minimum integer value
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            max = Math.max(max, num); // Update max if current number is larger
        }
        System.out.println(max);
    }
}
