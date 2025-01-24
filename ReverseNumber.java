import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversed = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Add it to the reversed number
            number = number / 10; // Remove the last digit from the number
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reversed);
    }
}

