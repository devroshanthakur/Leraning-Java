public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert the string to lowercase for case-insensitivity
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Check characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true;  // If all characters matched, it's a palindrome
    }

    public static void main(String[] args) {
        // Example strings to check
        String str1 = "A man a plan a canal Panama";
        String str2 = "Hello, World!";

        // Check and print whether each string is a palindrome
        System.out.println(str1 + " is palindrome: " + isPalindrome(str1));
        System.out.println(str2 + " is palindrome: " + isPalindrome(str2));
    }
}
