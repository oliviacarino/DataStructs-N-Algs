// Solution to Question 167
// @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">Link</a>

public class q167 {

    public static int[] twoSum(int[] nums, int target) {
        // index starts at 1 instead of 0
        int[] result = {0, 0};
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[left] + nums[mid] == target) {
                result[0] = left;
                result[1] = mid;

                // convert to 1-indexed
                int newFirst = result[0] + 1;
                int newSecond = result[1] + 1;
                result[0] = newFirst;
                result[1] = newSecond;

                return result;
            } // if
            if (nums[right] + nums[mid] == target) {
                result[0] = mid;
                result[1] = right;

                // convert to 1-indexed
                int newFirst = result[0] + 1;
                int newSecond = result[1] + 1;
                result[0] = newFirst;
                result[1] = newSecond;

                return result;
            } // if
            if (nums[right] + nums[left] == target) {
                result[0] = left;
                result[1] = right;

                // convert to 1-indexed
                int newFirst = result[0] + 1;
                int newSecond = result[1] + 1;
                result[0] = newFirst;
                result[1] = newSecond;

                return result;
            } // if
            left = mid - 1;
            right = mid + 1;
        } // while

        // convert 0-indexed to 1-indexed
/*        int newFirst = result[0] + 1;
        int newSecond = result[1] + 1;
        result[0] = newFirst;
        result[1] = newSecond;
*/
//        result[0] = result[0] + 1;
//        result[1] = result[1] + 1;

        return result;
    } // twoSum



    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        int[] nums = {2,3,4};
//        int target = 6;
//        int[] nums = {-1,0};
//        int target = -1;
        int[] nums = {3,24,50,79,88,150,345};
        int target = 200;
        System.out.println("Output: ");
        int[] output = new int[2];
        output = twoSum(nums, target);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        } // for
    } // main


} // q167
