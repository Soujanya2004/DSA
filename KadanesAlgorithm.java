public class KadanesAlgorithm {

    // Method to find the maximum sum of a contiguous subarray
    public static int findMaxSum(int[] arr) {
        // Initialize variables
        int maxSum = Integer.MIN_VALUE; // Maximum sum so far
        int currentSum = 0;             // Current sum of the subarray

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i]; // Add the current element to the current sum

            // Update maxSum if currentSum is greater
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If currentSum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // Return the maximum sum found
        return maxSum;
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Call the method and display the result
        int result = findMaxSum(array);
        System.out.println("The maximum sum of the contiguous subarray is: " + result);
    }
}

//**Kadane's Algorithm** finds the maximum sum of a contiguous subarray in **O(n)**. It keeps track of:
//1. `maxEndingHere`: Current subarray sum.
//2. `maxSoFar`: Maximum sum found so far.

//If `maxEndingHere` becomes negative, reset it to 0. The result is stored in `maxSoFar`.
