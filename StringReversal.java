public class StringReversal {

    // Method to reverse a string
    public static String reverseString(String str) {
        String reversed = "";  // Initialize an empty string to store the reversed string

        // Loop through the original string from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // Add each character to the reversed string
        }

        return reversed;  // Return the reversed string
    }

    public static void main(String[] args) {
        // Example string
        String original = "Hello, World!";

        // Call the reverseString method and store the result
        String reversed = reverseString(original);

        // Print the reversed string
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}

