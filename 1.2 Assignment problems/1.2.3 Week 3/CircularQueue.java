class MyCircularQueue {
       int[] circularArray;
       int front=0;
    int rear=-1;
    int len=0; // to keep the count of number of elements
    
    public MyCircularQueue(int k) {
      circularArray = new int[k];   
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
             rear = (rear+1)%circularArray.length;
            circularArray[rear] = value;
            len++;
            return true;
        }
        else
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            front = (front+1)%circularArray.length;
            len--;
            return true;
        }
        else
            return false;
    }
    
    public int Front() {
        return isEmpty()?-1:circularArray[front];
    }
    
    public int Rear() {
        return isEmpty()?-1:circularArray[rear];
    }
    
    public boolean isEmpty() {
        return len == 0;
    }
    
    public boolean isFull() {
        return len==circularArray.length;
    }
}

