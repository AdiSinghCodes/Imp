import java.util.*;
 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
 }   
 class Symmetric_Tree{
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(3);
        Symmetric_Tree s = new Symmetric_Tree();
        boolean m = s.isSymmetric(root.left,root.right);
        System.out.println(m);

    }

    public boolean isSymmetric(TreeNode root1,TreeNode root2)
    {
        if(root1 == null || root2 == null)
        {
            return root1==root2;
        }
        

        return (root1.val==root2.val) && isSymmetric(root1.left,root2.right) && isSymmetric(root1.right,root2.left);

        
    }
    
 } 