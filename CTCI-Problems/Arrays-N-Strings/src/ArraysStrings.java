// contains implementation for methods used with arrays and strings (ch. 1)

import java.util.HashMap;

public class ArraysStrings {
    static final String divider = "********************************";

    // METHODS //

    /**
     * Determines if a string has all unique
     * characters. Does not count whitespace.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * @param str   string to check
     * @return      true if unique; false otherwise
     */
    public static boolean isUnique(String str) {
        boolean unique = true;

        // store chars to map
        HashMap<Integer, Character> map = new HashMap<>();

        // parse through string and check for unique chars
        // does not include whitespace (ignore \n and " ")
        for (int i = 0; i < str.length(); i++) {
            char uniqueChar = str.charAt(i);
            if (!map.containsValue(uniqueChar) && uniqueChar != ' ') {
                map.put(i,uniqueChar);
            } else if (map.containsValue(uniqueChar)) {
                return false;
            } // if
        } // for

        return unique;
    } // isUnique

    /**
     * Checks if str1 is a permutation of str2.
     * str1: "asdf"
     * str2: {"adsf","adfs", etc.}
     *
     * Time Complexity: O(n)
     * Space Complexity: ?
     *
     * @param str1   the original string
     * @param str2   the possible permutation of str1
     * @return       true if permutation; false otherwise
     */
    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } // if

        int[] letters = new int[128]; // ASCI has 128 chars in it
        for (int i = 0; i < str1.length(); i++) {
            // increment frequency of letter as it occurs in str1
            letters[str1.charAt(i)]++;
        } // for

        for (int j = 0; j < str2.length(); j++) {
            // decrement letter as it occurs in str2
            // permutation if letters[] is all 0's
            letters[str2.charAt(j)]--;
            // if values < 0, then that means there are more of
            // that char in str2 than there were in str1
            if (letters[str2.charAt(j)] < 0) {
                return false;
            } // if
        } // for

        return true;
    } // isPermutation

    /**
     * Modifies the input string in place
     * by replacing spaces with "%20" instead.
     * @param str     the string to modify
     * @param length  the length of the the string
     */
    public static void url_ify(char str, int length) {


    } // url_ify


    ////////////////////////////////////////////////////////

    public static void main(String[] args) {
        // isUnique //
        // String str = "this is not unique"; // not unique
        String str = "the fox jumps"; // unique
        boolean isUnique = isUnique(str);
        System.out.println("- Testing isUnique(string) - ");
        System.out.println("Is Unique: " + isUnique);
        System.out.println(divider);

        String str1 = "asdf";
        String str2 = "sdfa"; // true
        // String str2 = "ssdfa"; // false
        boolean isPermutation = isPermutation(str1,str2);
        System.out.println("- Testing isPermutation(str1,str2) - ");
        System.out.println("Is Permutation: " + isPermutation);
        System.out.println(divider);

        char str3 = "Mr John Smith ";
        int length = 13;
        System.out.println("- Testing url_ify(str3,length) - ");
        System.out.println("Before: " + str3);
        System.out.println("After: " + url_ify(str3,length));
        System.out.println(divider);

    } // main

} // ArraysStrings
