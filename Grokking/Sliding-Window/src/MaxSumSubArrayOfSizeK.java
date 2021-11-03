class MaxSumSubArrayOfSizeK {
    public static int findMaxSumSubArray(int k, int[] arr) {
        // edge cases
        if (arr.length == 1) {
            return arr[0];
        } else if (arr.length == 0) {
            return -1;
        }

        int windowSum = 0;
        int max = 0;
        int current_max = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            current_max = windowSum;

            // check at each iteration if new max found
            if (current_max > max) {
                max = current_max;
            }
            // update windowSum as it moves forward by 1
            // if moving forward by more than 1, we'd change line 25
            // ex: moving ahead by 2, then we'd do windowEnd >= k - 2
            if (windowEnd >= k - 1) {
                windowSum -= arr[windowStart];
                windowStart++;
            }

        } // for
        return max;
    } // findMaxSumSubArray

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int max = findMaxSumSubArray(k,arr);
        System.out.println("max sum: " + max);
    } // main
}
