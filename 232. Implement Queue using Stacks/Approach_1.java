class MyQueue {
    Stack<Integer> s;
    Stack<Integer> s1;
    public MyQueue() {
        s= new Stack<>();
        s1= new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        if(s1.isEmpty()){
            while(!s.isEmpty()){
                s1.push(s.pop());
            }
        }
        return s1.pop();
    }
    
    public int peek() {
        if(s1.isEmpty()){
            while(!s.isEmpty()){
                s1.push(s.pop());
            }
        }
        return s1.peek();
    }
    
    public boolean empty() {
        return s.isEmpty() && s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */