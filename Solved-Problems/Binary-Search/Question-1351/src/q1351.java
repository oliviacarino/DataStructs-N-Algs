// Solution to Question 1351
// @see <a href="https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/">Link</a>

public class q1351 {

    // My Solution (does not pass tests)
/*    public static int totalNegNums(int[] nums) {
        int total = 0;

        int low = 0;
        int high = nums.length - 1; // can be neg value; nums non-increasing

        while (high <= low) {
            // find midpoint in nums[]
            int mid = (low + high) / 2;

            if (nums[mid] < 0) { // 5 4 3 -1 -3       5 4 -1 -2 -3 -4 -5
                // left portion could contain negatives
                low = mid + 1;
                total++; // increment total by 1 to account for neg at midpoint
            } else if (nums[mid] > 0) {
                // left portion does not contain negatives
                high = mid - 1;
            } // if

        } // while

        return total;

    } // totalNegNums
*/

    // Discussion Board Solution
    public static int totalNegNums(int[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        int result = 0; // total number of negative nums
        int lastNeg = cols - 1; // index of last negative num found
        for (int row = 0; row < rows; row++) {
            // edge case 1: if nums[row][0] < 0, all elements in row are negative
            if (nums[row][0] < 0) {
                result += cols;
                continue; // prevents for loop from ending after reaching this block
            } // if

            // edge case 2: if nums[row][cols - 1] >= 0, no elements in row are negative
            if (nums[row][cols - 1] >= 0) {
                continue; // prevents for loop from ending after reaching this block
            } // if

            // general case: mix of negative and non-negative numbers
            // ******* apply binary search algorithm *******
            int l = 0;       // tracks left portion
            int r = lastNeg; // tracks right portion
            while (l <= r) {
                int m = (l + r) / 2; // midpoint
                if (nums[row][m] < 0) {
                    // midpoint is negative value
                    // update right
                    r = m - 1;
                } else {
                    // midpoint is not negative value
                    // update left
                    l = m + 1;
                } // if
            } // while

            // calculate result and store index of last negative number
            // l points to first negative number
            // difference of cols - l == total negative numbers
            result += cols - l;
            lastNeg = l;

        } // for

        return result;

    } // totalNegNums

    public static void main(String[] args) {
        int[][] nums = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int totalNegs = totalNegNums(nums);
        System.out.println("Total negative nums: " + totalNegs);
    } // main

} // q1351
