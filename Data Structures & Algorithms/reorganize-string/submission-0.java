class Solution {
    public String reorganizeString(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a,b)-> map.get(b) - map.get(a)
        );//max heap
        pq.addAll(map.keySet());
        StringBuilder str = new StringBuilder();
        while(pq.size()>=2){
            char first = pq.poll();
            char second = pq.poll();
            str.append(first);
            str.append(second);
            map.put(first,map.get(first)-1);
            map.put(second,map.get(second)-1);
            if(map.get(first)>0){
                pq.offer(first);
            }
            if(map.get(second)>0){
                pq.offer(second);
            }
        }
        if(!pq.isEmpty()){
            char last = pq.poll();
            if(map.get(last)>1){
                return "";
            }
            str.append(last);
        }

        return str.toString();
    }
}