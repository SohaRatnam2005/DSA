class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>();
        int left = 0 ;
        int max_frequency ;
        int window_size = 0 ;
        for( int right = 0 ; right < s.length() ; right++){
            char curr = s.charAt(right);
            map.put(curr , map.getOrDefault(curr , 0) +1 );
            max_frequency = Collections.max(map.values());
            while( (right - left + 1 ) - max_frequency > k){
                char prev = s.charAt(left);
                map.put( prev , map.get(prev)-1);
                left++;
            }
            window_size = Math.max(window_size ,right - left + 1  );

        }
        return window_size ;
    }
}
