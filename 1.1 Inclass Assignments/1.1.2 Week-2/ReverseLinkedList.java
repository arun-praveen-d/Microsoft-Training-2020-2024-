class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null|| head.next == null)
            return head;
        ListNode next,prev=null;
        
        while(head != null){
            next  =head.next;
            head.next = prev;
            prev = head;
            head = next;
            
            
        }
        
        return prev;
    }
}
