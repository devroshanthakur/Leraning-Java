import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double firstNum = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNum = sc.nextDouble();

        System.out.print("Enter the third number: ");
        double thirdNum = sc.nextDouble();

        // Calculating the average
        double averageOf3Num = (firstNum + secondNum + thirdNum) / 3;

        // Format the result to two decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedAverage = df.format(averageOf3Num);


        // Display the result
        System.out.println("The average of the three numbers is: " + formattedAverage);

        // Close the scanner
        sc.close();
    }
}
