public class PartitionList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static Node partition(int x) {
        Node before_head = new Node(0);
        Node before = before_head;

        Node after_head = new Node(0);
        Node after = after_head;

        Node current = head;

        while (current != null) {
            if (current.data < x) {
                before.next = current;
                before = before.next;
            } else {
                after.next = current;
                after = after.next;
            }
            current = current.next;
        }

        after.next = null;
        before.next = after_head.next;

        return before_head.next;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(4);
        addLast(3);
        addLast(2);
        addLast(5);
        addLast(2);

        int x = 3;

        System.out.print("Original List  : ");
        printList(head);

        Node result = partition(x);

        System.out.print("Partitioned List: ");
        printList(result);
    }
}
