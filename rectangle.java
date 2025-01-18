import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        // Calculating the area and perimeter
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("The area of the rectangle is: " + area + ", and the perimeter is: " + perimeter);
    }
}
