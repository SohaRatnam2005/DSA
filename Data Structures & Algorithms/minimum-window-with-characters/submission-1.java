class Solution {
    public String minWindow(String s, String t) {

        int[] freq = new int[128];

        // Store how many of each character we need
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // We found a character that we actually need
            if (freq[ch] > 0) {
                count--;
            }

            // Include this character in our window
            freq[ch]--;

            // Window contains all characters of t
            while (count == 0) {

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);

                freq[leftChar]++;

                // If frequency becomes positive,
                // we have removed a required character
                if (freq[leftChar] > 0) {
                    count++;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}