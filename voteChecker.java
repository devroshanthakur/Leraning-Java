import java.util.Scanner;

public class voteChecker {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //The user to enter their age
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("Sorry, you are not eligible to vote.");
        }

        // Close the scanner
        sc.close();
    }
}
