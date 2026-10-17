/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode temp = head;

        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }
        return creat(arr,0,arr.size()-1);

    }

    public TreeNode creat(ArrayList<Integer> arr, int left, int right)
    {
        if(left>right)
        {
            return null;
        }

        int mid = (left + right)/2;
        TreeNode m =  new TreeNode(arr.get(mid));
        m.left = creat(arr,left,mid-1);
        m.right = creat(arr,mid+1,right);
        return m;
    }
}
