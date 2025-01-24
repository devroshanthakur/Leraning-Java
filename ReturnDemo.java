// Write a program to demonstrate the use of return in methods.

public class ReturnDemo {

    // Method that adds two numbers and returns the result
    public static int add(int a, int b) {
        return a + b;  // Return the sum of a and b
    }

    // Method that multiplies two numbers and returns the result
    public static int multiply(int a, int b) {
        return a * b;  // Return the product of a and b
    }

    // Method that checks if a number is even and returns true or false
    public static boolean isEven(int number) {
        return number % 2 == 0;  // Return true if the number is even, otherwise false
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        int num1 = 5, num2 = 3;

        // Use the add method and print the result
        int sum = add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        // Use the multiply method and print the result
        int product = multiply(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        // Use the isEven method and print the result
        boolean isNum1Even = isEven(num1);
        boolean isNum2Even = isEven(num2);
        System.out.println(num1 + " is even: " + isNum1Even);
        System.out.println(num2 + " is even: " + isNum2Even);
    }
}
