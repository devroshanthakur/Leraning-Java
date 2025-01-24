public class LCMCalculator {

    // Method to calculate the GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate the LCM of two numbers
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);  // Formula for LCM
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        // Calculate LCM and print the result
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
    }
}
