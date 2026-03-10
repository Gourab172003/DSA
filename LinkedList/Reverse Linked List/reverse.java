public class reverse{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addLast(int data)
    {
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void reverse(Node head)
    {
        Node current = head;
        Node prev = null;
        Node next;

        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        reverse.head = prev;
    }

    public static void display(Node head)
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String args[])
    {
        reverse LL = new reverse();

        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(3);
        LL.addLast(4);

        display(head);

        LL.reverse(head);

        LL.display(head);
    }
}