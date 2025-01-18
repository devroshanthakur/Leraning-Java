import java.util.Scanner;

public class TwoIntegers {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their first number
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        // Prompt the user to enter their second number
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        // Perform operations
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;

        // Perform division with decimal output
        if (secondNumber != 0) {
            double quotient = (double) firstNumber / secondNumber;
            System.out.println("The quotient of the two integers is: " + quotient);
        } else {
            System.out.println("Division by zero is undefined.");
        }

        // Display results
        System.out.println("The sum of the two integers is: " + sum);
        System.out.println("The difference of the two integers is: " + difference);
        System.out.println("The product of the two integers is: " + product);

        // Close the scanner
        sc.close();
    }
}
