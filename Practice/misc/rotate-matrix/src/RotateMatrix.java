/**
 * This is a simply program that rotates an NxN
 * matrix 90 degrees clockwise. This algorithm
 * is done IN PLACE so no extra memory is used.
 * It first transposes the matrix and then flips
 * it horizontally.
 * 
 * Time:  O(n)
 * Space: O(1)
 * 
 * Example:
 * [1,2,3]       [7,4,1]
 * [4,5,6]  -->  [8,5,2]
 * [7,8,9]       [9,6,3]
 */

public class RotateMatrix {

    static int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    
    /**
     * Transposes the matrix.
     * (swaps the nth row with the nth coloumn)
     *
     * [1,2,3]      [1,4,7]
     * [4,5,6] -->  [2,5,8]
     * [7,8,9]      [3,6,9]
     * 
     */
    public static void transpose() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[0].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp; 
            } // for
        } // for
    } // transpose

    /**
     * Flips the matrix horizontally.
     * This completes the 90 degree matrix
     * rotation.
     * 
     * [1,4,7]      [7,4,1]
     * [2,5,8] -->  [8,5,2]
     * [3,6,9]      [9,6,3]
     */
    public static void swapHorz() {
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            // we go until i < n/2 because we are working inwards; going to the halfway point of the column
            for (int j = i; j < n/2; j++) { 
                int temp = array[i][j];
                array[i][j] = array[i][n - 1 - j];
                array[j][n - 1 - j] = temp;
            } // for
        } // for
    } // swapHorz

    
    // prints the matrix
    public static void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            } // for
            System.out.print("]");
            System.out.println();
        } // for
    } // print
    
    public static void main(String[] args) {        
        System.out.println("Before 90 Degree Rotation");
        // print matrix
        print();

        transpose();
        //System.out.println("After transpose()");
        //print();

        swapHorz();
        //System.out.println("After swapHorz()");
        //print();

        System.out.println("After 90 Degree Rotation");
        print();


    } // main

} // RotateMatrix