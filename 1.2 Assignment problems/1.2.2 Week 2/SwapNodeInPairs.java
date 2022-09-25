class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode cur = temp;
   
        while(cur.next != null && cur.next.next != null)
        {
            ListNode first = cur.next;     //1.   first second        //2.    first second
                                          //       |  |               //         |   |
                                           //curr->1->2->3->4         //   2->1->3->4
        ListNode second = cur.next.next;                              //      |
                                                                      //      cur
          
           first.next = second.next;  //1. 2 1->3->4                
            cur.next = second;        // cur->2 1->3>4
            cur.next.next = first;    // cur->2->1->3->4
                                          
                                     // cur
                                     //   |
            cur = cur.next.next;     //2->1->3->4
        }
        return temp.next;
    }
}
