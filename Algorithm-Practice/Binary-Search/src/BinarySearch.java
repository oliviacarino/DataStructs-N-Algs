/**
 * A driver program that implements the binary search algorithm.
 * Credit: @see <a href="https://www.techiedelight.com/binary-search/">Link</a>
 */

public class BinarySearch {

    /**
     * Implements the binary search algorithm.
     * Returns index of target if found; otherwise
     * returns -1.
     *
     * @param nums    the array of integers to search
     * @param target  the target value to find in {@code nums}
     * @return        the index of {@code target}
     */
    public static int binarySearch(int[] nums, int target) {
        // search space is nums[left ... right]
        int left = 0, right = nums.length - 1;

        // loop until the search space is exhausted
        while (left <= right) {
            // find the mid-value in the search space
            // and compare it with the target
            int mid = (left + right) / 2;

            // overflow can happen. Use:
            // int mid = left (right - left) / 2;
            // int mid = right -(right - left) / 2;

            // target is found
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                // discard all elements in the right search sapce,
                // including the middle element
                right = mid - 1;
            } else {
                // discard all elements in the left search space,
                // including the middle element
                left = mid + 1;
            } // if

        } // while

        return -1;

    } // binarySearch

    public static void main(String[] args) {
//        int nums[] = {2, 5, 6, 8, 9, 10};
        int nums[] = {1,4,10,27,34,101,258};
//        int target = 5; // change me
        int target = 10;
        int index = binarySearch(nums, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in array.");
        } // if

    } // main

} // BinarySearch
