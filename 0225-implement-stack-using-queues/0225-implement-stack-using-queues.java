class MyStack {
    Queue<Integer> q = new ArrayDeque<>();
    int size =0;
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        size++;
    }
    
    public int pop() {
       for(int i =1;i<size;i++){
        q.add(q.remove());
       } 
       int x = q.remove();
       size--;
       return x;
    }
    
    public int top() {
        for(int i =1;i<size;i++){
        q.add(q.remove());
       } 
       int x = q.remove();
       q.add(x);
       return x; 
    }
    
    public boolean empty() {
        return size==0;
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