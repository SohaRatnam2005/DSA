class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int left = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            count[s.charAt(right) - 'A']++;

            // Maximum frequency in current window
            maxFreq = Math.max(
                maxFreq,
                count[s.charAt(right) - 'A']
            );

            // Characters that need replacement
            int windowSize = right - left + 1;
            int replacements = windowSize - maxFreq;

            // Shrink window if more than k replacements needed
            while (replacements > k) {
                count[s.charAt(left) - 'A']--;
                left++;

                windowSize = right - left + 1;
                replacements = windowSize - maxFreq;
            }

            // Update answer
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}