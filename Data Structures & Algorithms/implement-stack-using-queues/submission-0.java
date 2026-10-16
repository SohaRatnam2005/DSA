class MyStack {
    Deque<Integer> de ;
    public MyStack() {
         de = new ArrayDeque<>();
    }
    public void push(int x) {
        de.offerLast(x);
    }
    
    public int pop() {
        return de.pollLast();
    }
    
    public int top() {
        return de.peekLast();
    }
    
    public boolean empty() {
        return de.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */