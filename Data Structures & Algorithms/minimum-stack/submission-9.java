class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty() || minstack.peek() >= val){
            minstack.push(val);
        }
        
    }
    
    public void pop() {
        int val = stack.peek();
        stack.pop();
        if(minstack.peek() == val){
            minstack.pop();
        }
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}
