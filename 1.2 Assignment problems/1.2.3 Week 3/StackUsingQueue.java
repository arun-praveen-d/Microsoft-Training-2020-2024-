/*//1.Push operation costly
class MyStack {
     Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();        
    }
    
    public void push(int x) {
        queue2.add(x);
        
        while(!queue1.isEmpty()){
            int top = queue1.remove();
            queue2.add(top);
        }
        
        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;
    }
    
    public int pop() {
        if(queue1.isEmpty())
            return -1;
       int top = queue1.peek();
        queue1.remove();
        return top;
    }
    
    public int top() {
        if(queue1.isEmpty())
            return -1;
        return queue1.peek();
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}
*/
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//2.Pop operation costly
class MyStack {
     Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();        
    }
    
    public void push(int x) {
       queue1.add(x);
    }
    
    public int pop() {
    
       while(queue1.size()!=1){

           queue2.add(queue1.peek());
           queue1.remove();
       }
        
        int top = queue1.remove();
        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;
        
        
        return top;
    }
    
    public int top() {
  int top ;
       while(queue1.size()>1){
          top = queue1.remove();
           queue2.add(top);
       }
        
        top = queue1.peek();
        queue2.add(top);
        queue1.remove();
        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;
        
        
        return top;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}
