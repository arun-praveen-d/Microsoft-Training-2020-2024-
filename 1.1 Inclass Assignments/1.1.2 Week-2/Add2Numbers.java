class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode dhead = new ListNode(0);
        ListNode l3 = dhead;
        int car = 0;
        while(l1 != null || l2 != null)
        {
            int l1_val = (l1 != null)?l1.val:0;
            int l2_val = (l2 != null)?l2.val:0;
            
            int sum = l1_val+l2_val +car;
           car = sum/10;
            int last = sum % 10;
            
            ListNode fin = new ListNode(last);
            
            l3.next = fin;
            
            if(l1 != null) l1 = l1.next;
                if(l2 != null) l2 = l2.next;
        
        
        l3 = l3.next;
        }
        
        if(car > 0)
        {
            ListNode fin = new ListNode(car);
            l3.next = fin;
            l3 = l3.next;
            
        }
    
    return dhead.next;
    }
}
