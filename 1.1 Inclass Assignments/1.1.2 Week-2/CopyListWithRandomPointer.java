class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;

        HashMap<Node,Node> map = new HashMap<>();
        
        Node node = head;
        //1.copy the nodes in the map
        while(node != null){
            map.put(node, new Node(node.val));
            node = node.next; 
        }
        
        node = head;
        
        //2.assign next and random pointers
        while(node != null){
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            
            node = node.next;
        }

    return map.get(head);
    }
}
