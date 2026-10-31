/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> arr = new ArrayList<>();
        helper(arr,root);
        return arr;
    }


    public void helper(List<Integer> arr, Node root)
    {
        if(root==null)
        {
            return;
        }

        arr.add(root.val);
        for(Node ch: root.children)
        {
            helper(arr,ch);
        }
    }
}