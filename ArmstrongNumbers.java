public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 500:");

        // Loop through numbers from 1 to 500
        for (int number = 1; number <= 500; number++) {
            int sum = 0;
            int originalNumber = number;
            int digits = 0;

            // Count the number of digits in the number
            while (originalNumber != 0) {
                originalNumber /= 10;
                digits++;
            }

            originalNumber = number; // Reset the original number

            // Calculate the sum of each digit raised to the power of the number of digits
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += Math.pow(digit, digits); // Raise digit to the power of 'digits'
                originalNumber /= 10;
            }

            // Check if the number is an Armstrong number
            if (sum == number) {
                System.out.print(number + " ");
            }
        }
    }
}
