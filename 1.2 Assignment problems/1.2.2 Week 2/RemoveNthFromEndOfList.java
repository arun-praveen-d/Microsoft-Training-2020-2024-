class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
           temp = temp.next;
        }
        
        temp = head;
        
        int target = count - n;
        
        if(target == 0)
            return head.next;
        
       for(int i=0;i<target-1;i++){
           temp = temp.next;
       }
        
        temp.next=  temp.next.next;
        
        return head;
    }
}
