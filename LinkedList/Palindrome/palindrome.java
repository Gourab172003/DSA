public class palindrome{
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;

        }
    }

    public static Node head;
    public static Node tail;

    public static void addLast(int data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;

    }

    public static Node midPoint(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static boolean isPalindrome()
    {
       if(head==null || head.next==null)
       {
        return true;
       }

       else{

        Node mid= midPoint(head);

        Node current=mid;
        Node prev=null;
        Node next=null;

        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        Node left=head;
        Node right= prev;

        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            else{
            left=left.next;
            right=right.next;
            }
        }
       }
       return true;
    }

    public static void main(String[] args)
    {
      addLast(1);
      addLast(2);
      addLast(3);
      addLast(4);
      addLast(3);
      addLast(2);
      addLast(1);
      System.out.print(isPalindrome());

    }

}