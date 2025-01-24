public class SwapNumbers {
    public static void main(String[] args) {
        int a = 7, b = 3;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without a third variable
        a = a + b; // a now becomes 10 (7 + 3)
        b = a - b; // b now becomes 7 (10 - 3)
        a = a - b; // a now becomes 3 (10 - 7)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
