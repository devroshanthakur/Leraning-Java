//Write a program to check if a number is even or odd.


import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number to check if it's even or odd: ");
        int number = scanner.nextInt(); // Read the integer input

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
