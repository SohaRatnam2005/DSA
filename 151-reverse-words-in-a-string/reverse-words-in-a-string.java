class Solution {
    public String reverseWords(String s) {
        // Trim leading/trailing spaces, then split by one or more spaces
        String[] str = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]);
            if (i != 0) sb.append(" "); // only add space between words
        }

        return sb.toString();
    }
}
