class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks){
            freq[task-'A']++;
        }
        int maxFreq = 0 ;
        for(int f : freq){
            maxFreq = Math.max(f,maxFreq);
        }
        int maxCount = 0 ;
        for(int f : freq){
            if(f == maxFreq){
                maxCount++;
            }
        }
        int res = ((maxFreq - 1)*(n + 1 )) + maxCount ;
        return Math.max(tasks.length , res);
// use formula for res 
// ((maxFreq - 1 ) * ( n + 1)) + maxCount 
// maxCount is the number of Characters having maxFreq
    }
}
