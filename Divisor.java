import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Try-with-resources
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
