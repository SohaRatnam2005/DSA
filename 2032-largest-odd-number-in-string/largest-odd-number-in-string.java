class Solution {
    public String largestOddNumber(String num) {
        // Traverse from right to left
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            
            // Check if digit is odd
            if ((c - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
