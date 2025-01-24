import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = 0;

        // Find the sum of digits using a while loop
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number = number / 10; // Remove the last digit from the number
        }

        // Output the sum of the digits
        System.out.println("The sum of digits is: " + sum);
    }
}
