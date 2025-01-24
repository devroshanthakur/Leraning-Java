public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i; // Add the even number to the sum
            }
        }

        // Output the sum of all even numbers
        System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
    }
}
