public class stock {
    public static void profit(int[] arr) {
        int bp = arr[0]; // Initialize buying price
        int[] parr = new int[arr.length]; // Array to store profits
        int p;

        // Calculate profits and store in parr
        for (int i = 0; i < arr.length; i++) {
            if (bp > arr[i]) {
                bp = arr[i]; // Update buying price if a lower price is found
            }
            p = arr[i] - bp;
            parr[i] = p; //add p to p array
        }

        // Find the maximum profit
        int max = parr[0]; 
        for (int i = 1; i < parr.length; i++) {
            if (parr[i] > max) {
                max = parr[i]; 
            }
        }

        // Print the maximum profit
        System.out.println("Maximum Profit at: " + max+" index");
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4}; 
        profit(prices);
    }
}//O(n)
