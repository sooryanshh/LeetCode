class CustomStack {
     Stack<Integer> st = new Stack<>();
     Stack<Integer> helper = new Stack<>();
     int maxSize;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(st.size()<maxSize)
        st.push(x);
    }
    
    public int pop() {
      if(!st.isEmpty())return st.pop();
      else return -1;  
    }
    
    public void increment(int k, int val) {
        int n = st.size();
        k = Math.min(k,n);
        for(int i =0;i<n-k;i++){
        helper.push(st.pop());
        }
        
        for(int i =0;i<k;i++){
           
            helper.push(st.pop()+val);
        }
        while(!helper.isEmpty()){
            st.push(helper.pop());
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */