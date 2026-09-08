class Solution {
    public int countCommas(int n) {
         long ans = 0;

        if (n >= 1000)
            ans += Math.min(n, 999999L) - 999;

        if (n >= 1000000)
            ans += (Math.min(n, 999999999L) - 999999) * 2;

        if (n >= 1000000000)
            ans += (n - 999999999L) * 3;

        return (int)ans;


    }
}