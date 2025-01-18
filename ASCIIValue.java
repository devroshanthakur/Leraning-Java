import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0); // Read the first character of the input

        // Get the ASCII value of the character
        int asciiValue = (int) character;

        // Display the ASCII value
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);

        // Close the scanner
        sc.close();
    }
}
