public class MaxValueArray {

    // Method to find the maximum value in an array
    public static int findMax(int[] arr) {
        // Assume the first element is the maximum
        int max = arr[0];

        // Loop through the array to compare each element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if a larger value is found
            }
        }

        return max;  // Return the maximum value found
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {34, 12, 78, 56, 89, 23};

        // Find the maximum value and print the result
        int max = findMax(numbers);
        System.out.println("The maximum value in the array is: " + max);
    }
}
