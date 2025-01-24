public class GCDCalculator {

    // Method to calculate the GCD of two numbers
    public static int gcd(int a, int b) {
        // Euclidean algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;  // Remainder of a divided by b
            a = temp;   // Set a to b
        }
        return a;  // The GCD will be in 'a'
    }

    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98;

        // Calculate GCD and print the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}
