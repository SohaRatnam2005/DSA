class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;

        // Take first k cards from left
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        
        int maxSum = sum;
        
        // Now replace left cards with right cards one by one
        for (int i = 0; i < k; i++) {
            sum -= cardPoints[k - 1 - i];      // remove one from left end
            sum += cardPoints[n - 1 - i];      // add one from right end
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}
