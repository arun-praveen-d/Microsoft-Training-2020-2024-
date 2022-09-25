class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     ListNode temp = new ListNode();
        ListNode finallist = temp ;
    
        
        while(l1 != null && l2 != null)
        {
            if(l1.val <= l2.val)
            {
                temp.next = l1;
            
              l1 = l1.next;
                }
            else if(l1.val >= l2.val)
            {
                temp.next = l2;
                l2 = l2.next;
            }
          
    
        temp = temp.next;
            
        }
        temp.next = (l1==null)?l2:l1;
        return finallist.next;
        }
}
