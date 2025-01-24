import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Handle negative numbers by taking the absolute value
        number = Math.abs(number);

        int count = 0;

        // Count the number of digits
        if (number == 0) {
            count = 1; // Special case: 0 has one digit
        } else {
            while (number > 0) {
                number = number / 10; // Remove the last digit
                count++; // Increment the digit count
            }
        }

        // Output the number of digits
        System.out.println("The number of digits is: " + count);
    }
}
