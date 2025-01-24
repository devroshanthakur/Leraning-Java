import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        // Check if the input is valid
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("The first " + n + " terms of the Fibonacci sequence are:");

            // Initialize the first two terms
            int first = 0, second = 1;

            // Generate and print the Fibonacci sequence
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                // Compute the next term
                int next = first + second;
                first = second;
                second = next;
            }
        }
    }
}
