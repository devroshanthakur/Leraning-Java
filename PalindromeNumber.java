import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;  // Store the original number
        int reversed = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            reversed = reversed * 10 + digit;  // Build the reversed number
            number = number / 10;  // Remove the last digit
        }

        // Check if the number is a palindrome
        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
