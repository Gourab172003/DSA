class MyLinkedList {

    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node temp = head;
        int c = 0;
        while (c != index) {
            temp = temp.next;
            c++;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node temp = head;
        int c = 0;
        while (c != index - 1) {
            temp = temp.next;
            c++;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return;
        }
        Node temp = head;
        int c = 0;
        while (c != index - 1) {
            temp = temp.next;
            c++;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */