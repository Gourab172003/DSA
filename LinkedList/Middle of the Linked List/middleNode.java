class Solution {

    public ListNode middleNode(ListNode head) {

        ListNode temp = head;
        int c = 0;

        // count nodes
        while(temp != null)
        {
            c++;
            temp = temp.next;
        }

        temp = head;
        int i = 0;

        // move to middle
        while(i < c/2)
        {
            temp = temp.next;
            i++;
        }

        // return middle node
        return temp;
    }
}
