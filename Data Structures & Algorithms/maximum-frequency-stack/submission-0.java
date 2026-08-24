class FreqStack {
    Map<Integer,Stack<Integer>> freqstack ;
    Map<Integer,Integer> map ;
    int max_freq;
    public FreqStack() {
       freqstack = new HashMap<>();
        map = new HashMap<>();
        max_freq = 0 ;
    }
    
    public void push(int val) {
        int freq = map.getOrDefault(val,0)+1;
        map.put(val ,freq);
        if(freq > max_freq){
            max_freq = freq ;
        }
        freqstack.computeIfAbsent(freq, f->new Stack()).push(val);
    }
    
    public int pop() {

        Stack<Integer> s = freqstack.get(max_freq);
        int top = s.pop();
        if(s.isEmpty()) max_freq--;
        map.put(top , map.get(top)-1);
        return top;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */