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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int idx=1;
        ListNode temp=head; ListNode Temp=temp;
        Stack<Integer>ab= new Stack <>();
        while(temp!=null)
        {
            if(idx!=left)
            {
                idx++;
                temp=temp.next;
                Temp=Temp.next;
            }
            else {
                while(idx<=right)
                {
                    
                    ab.push(Temp.val);
                    Temp=Temp.next;
                    idx++;

                }
                while(left<=right)
                {
                    temp.val=ab.pop();
                    temp=temp.next;
                    left++;

                }
                break;
                
                }

        }
        return head;
        
    }
}