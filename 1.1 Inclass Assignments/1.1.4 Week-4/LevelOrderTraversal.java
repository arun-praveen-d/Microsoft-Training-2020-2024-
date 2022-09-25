class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null)
            return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(true){
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            if(size==0)
                break;
            while(size>0){
                TreeNode t = q.peek();
                temp.add(t.val);
                q.remove();
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);

            
          size--;
            }
            res.add(temp);
        }
   return res;        
    }
}
