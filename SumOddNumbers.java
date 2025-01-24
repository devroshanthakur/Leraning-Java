public class SumOddNumbers {
    public static void main(String[] args) {
        int sum = 0;

        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                sum += i; // Add the odd number to the sum
            }
        }

        // Output the sum of all odd numbers
        System.out.println("The sum of all odd numbers between 1 and 100 is: " + sum);
    }
}
