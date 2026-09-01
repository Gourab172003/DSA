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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> ab = new ArrayList<>();
        int a[] = new int[2];

        ListNode prev = head;
        ListNode current = head.next;
        ListNode Next = head.next.next;
        int i = 1;

        while (Next != null) {
            if (current.val > prev.val && current.val > Next.val) {
                ab.add(i);
            } else if (current.val < prev.val && current.val < Next.val) {
                ab.add(i);
            }
            prev = prev.next;
            current = current.next;
            Next = Next.next;
            i++;
        }

        int Size = ab.size();
        if (Size < 2) {
            a[0] = -1;
            a[1] = -1;
            return a;
        }

        a[1] = ab.get(Size - 1) - ab.get(0);

        int mini = Math.abs(ab.get(0) - ab.get(1));
        a[0] = mini;

        int c = 1;
        while (c < Size - 1) {
            int cur = Math.abs(ab.get(c) - ab.get(c + 1));
            mini = Math.min(mini, cur);
            a[0] = mini;
            c++;
        }

        return a;
    }
}