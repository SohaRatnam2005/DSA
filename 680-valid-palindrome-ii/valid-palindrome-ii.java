class Solution {

    // Helper method to check palindrome in substring s[i..j]
    public boolean isVal(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true; // must return true if no mismatches found
    }

    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                // try skipping either left or right char
                return isVal(s, i + 1, j) || isVal(s, i, j - 1);
            }
            i++;
            j--;
        }

        return true;
    }
}
