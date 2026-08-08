class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        
        int len = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        k = k % len;
        if (k == 0) return head;

        for (int i = 0; i < k; i++) {
         
            ListNode secondLast = head;
            while (secondLast.next.next != null) {
                secondLast = secondLast.next;
            }

            ListNode last = secondLast.next;
            last.next = head;
            secondLast.next = null;
            head = last; 
        }

        return head;
    }
}