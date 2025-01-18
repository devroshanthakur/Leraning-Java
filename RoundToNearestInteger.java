import java.util.Scanner;

public class RoundToNearestInteger {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a floating-point number
        System.out.print("Enter a floating-point number: ");
        double number = sc.nextDouble();

        // Round the number to the nearest integer
        int roundedNumber = (int) Math.round(number);

        // Display the result
        System.out.println("The number rounded to the nearest integer is: " + roundedNumber);

        // Close the scanner
        sc.close();
    }
}
