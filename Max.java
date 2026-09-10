class Solution {
    public int maxDepth(TreeNode root) {
         if(root==null)
        {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right) + 1;
    }
    public int height(TreeNode root)
    {
     if(root==null)
        {
            return 0;
        }
        return 1 + Math.max(height(root.left) , height(root.right));
    }
}
