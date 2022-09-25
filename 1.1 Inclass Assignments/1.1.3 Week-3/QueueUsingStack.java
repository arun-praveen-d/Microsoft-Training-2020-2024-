/*
//1.Enqueue operation costly
class MyQueue {
      
     Stack<Integer> st1 ;
       Stack<Integer> st2 ;
    
    public MyQueue() {
        st1 = new Stack<Integer>();
        st2 = new Stack<Integer>();
    }
    
    public void push(int x) { //Enqueue
        if(st1.isEmpty())
            st1.push(x);
        
        else{
            while(!st1.isEmpty())
            {
                st2.push(st1.pop());
            }
            
            st1.push(x);
            
            while(!st2.isEmpty())
            {
                st1.push(st2.pop());
            }
            
        }
    }
    
    public int pop() { //Dequeue
       return st1.pop();   
    }
    
    public int peek() {//front
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}
*/
//2.Dequeue operation costly
class MyQueue {
Stack<Integer> stack1;
Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {//Enqueue
        stack1.push(x);
    }
    
    public int pop() { //Dequeue
        int val;
       while(!stack1.isEmpty()){
           stack2.push(stack1.pop());
       }   
        val = stack2.pop();
        
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        
        return val;

    }
    
    public int peek() {//Front
          int val;
       while(!stack1.isEmpty()){
           stack2.push(stack1.pop());
       }   
        val = stack2.peek();
        
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        
        return val;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}
