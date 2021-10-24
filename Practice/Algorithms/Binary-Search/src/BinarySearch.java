// reimplmentaiton of binary search algorithm
// only works on sorted lists
// time complexity: O(logN)

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        // 1. create and set left/right subarray starting indices
        int left = 0;
        int right = arr.length - 1;

        // 2. loop through until left <= right
        while (left <= right) {
            // 3. calculate midpoint
            int mid = (left + right) / 2;

            // 4. check for target
            if (arr[mid] == target) {
                // 5.a target found at midpoint
                return mid;
            } else if (target < arr[mid]) {
                // 5.b adjust right subarray since value is smaller than range of right subarray
                right = mid - 1;
            } else {
                // 5.c adjust left subarray since value is greater than range of left subarray
                left = mid + 1;
            } // if

        } // while

        return -1;

    } // binarySearch

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,4,10,27,34,101,258};

        System.out.print("Enter a target to find: ");
        int target = input.nextInt();
        System.out.println();

        int result = binarySearch(arr,target);
        if (result != -1) {
            System.out.println("index of target: " + result);
        } else {
            System.out.println("element not in list");
        } // if

    } // main


} // BinarySearch
