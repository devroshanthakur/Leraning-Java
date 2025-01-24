public class PowerCalculator {

    // Method to calculate power of a number
    public static int power(int base, int exponent) {
        int result = 1;

        // Multiply base 'exponent' times
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        int base = 5;
        int exponent = 3;

        // Calculate power
        int result = power(base, exponent);

        // Output the result
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
