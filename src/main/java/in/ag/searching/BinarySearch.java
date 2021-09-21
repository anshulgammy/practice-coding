package in.ag.searching;

/**
 * Binary Search Implementation.
 */
public class BinarySearch {
    /**
     * input[] is provided here in sorted order.
     *
     * @param input
     * @return
     */
    public int performBinarySearch(int[] input, int target) {
        int n = input.length;
        int low = 0;
        int high = n - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (input[mid] == target) {
                return mid;
            } else if (input[mid] > target) {
                high = mid - 1;
            } else if (input[mid] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * Binary search implementation using Recursion.
     * input[] is provided here in sorted order.
     *
     * @param input
     * @param target
     * @param low
     * @param high
     * @return
     */
    public int performRecursionBinarySearch(int[] input, int target, int low, int high) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (input[mid] == target) {
                return mid;
            } else if (input[mid] > target) {
                return performRecursionBinarySearch(input, target, low, mid - 1);
            } else {
                return performRecursionBinarySearch(input, target, mid + 1, high);
            }
        }
        return -1;
    }

}
