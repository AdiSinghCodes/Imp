class Solution {

    int c = 1;
    int m = 1;

    public int maxDepth(TreeNode root) {

        if(root == null)
            return 0;

        first(root.left, 1);
        second(root.right, 1);

        return Math.max(c, m);
    }

    public void first(TreeNode root, int level)
    {
        if(root == null)
            return;

        c = Math.max(c, level + 1);

        first(root.left, level + 1);
        first(root.right, level + 1);
    }

    public void second(TreeNode root, int level)
    {
        if(root == null)
            return;

        m = Math.max(m, level + 1);

        second(root.right, level + 1);
        second(root.left, level + 1);
    }
}
