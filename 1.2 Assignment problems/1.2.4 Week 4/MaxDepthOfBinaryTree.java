class Solution {
    public int maxDepth(TreeNode root) {
        return height(root);
    }
    public int height(TreeNode root){
        if(root==null)
            return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
    }
}
