import java.util.Scanner;

public class SumNumbersDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        // Calculate sum using do-while loop
        do {
            sum += i;
            i++;
        } while (i <= n);

        // Output the sum
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}
