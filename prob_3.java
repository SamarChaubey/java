import java.util.Scanner;
public class prob_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            char ch = scanner.next().charAt(0);
            if (ch == 'X' || ch == 'x') {
                break;
            }
            double n1 = scanner.nextDouble();
            double n2 = scanner.nextDouble();
            double result = 0;
            switch (ch) {
                case '+': result = n1 + n2; break;
                case '-': result = n1 - n2; break;
                case '*': result = n1 * n2; break;
                case '/': result = (n2 != 0) ? n1 / n2 : Double.NaN; break;
                case '%': result = (n2 != 0) ? (int) n1 % (int) n2 : Double.NaN; break;
                default: System.out.println("Invalid operation. Try again."); continue;
            }
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero or modulus by zero.");
            }
        }
    }
}
