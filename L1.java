import java.util.*;
class ListNode
{
     int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class L1{
    

   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = null;
        ListNode tail = null;
        for(int i=0; i<n; i++)
        {
            int m = sc.nextInt();
            ListNode j = new ListNode(m);
            if(head==null)
            {
                head = j;
                tail = j;
            }
            else
            {
                tail.next = j;
                tail = j;
            }
        }
        ListNode temp = head;
        while(head!=null && head.next!=null)
        {
            if(head.val == head.next.val)
            {
                head.next = head.next.next;
            }
            else
            {
                head = head.next;
            }
        }
        while(temp!=null)
        {
            System.out.print(temp.val);
            temp = temp.next;
        }
        sc.close();
    }
}
