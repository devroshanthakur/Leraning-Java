// Write a method to check whether a number is perfect (a number is perfect if the sum of its divisors equals the number).

public class PerfectNumberCheck {

    // Method to check if a number is perfect
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        // Find all divisors of the number (excluding the number itself)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors equals the number
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 6;

        // Check if the number is perfect
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
