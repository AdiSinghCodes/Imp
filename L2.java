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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> mp = new LinkedHashMap<>();
        ListNode temp = head;
        int c = 0;
        while(temp!=null)
        {
            mp.put(temp.val, mp.getOrDefault(temp.val,0)+1);
            c++;
            temp = temp.next;
        }
        ListNode newNode = null;
        ListNode tail = null;
        for(int key : mp.keySet())
        {
            if(mp.get(key)==1)
            {
                ListNode m = new ListNode(key);
                if(newNode==null)
                {
                    newNode = m;
                    tail = m;
                }
                else
                {
                    tail.next = m;
                    tail = m;
                }
            }
        }
        return newNode;

    }
}