import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Hi, Please Enter Your Name: ");
        String yourName = sc.nextLine(); // Get the user's name

        // Print the greeting
        System.out.print("Good morning, " + yourName +"!!!");

        // Close the scanner
        sc.close();
    }
}
