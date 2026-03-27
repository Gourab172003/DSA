public class delte{

    static class Node {
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

    public static Node addLast(int data)
    { int i=0;
        Node newNode= new Node(data);
        if(head==null)
        {
            head= tail=newNode;
            i++;
            return newNode;
        }

        tail.next=newNode;
        tail=newNode;
        return newNode;
        
    }

    public static void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void skiTar(Node a){
       
      a.data=a.next.data;
      a.next=a.next.next;
    }

    public static void main (String args [])
    {
        delte a= new delte();
        Node a1=a.addLast(1);
          Node a2=a.addLast(2);
        Node a3= a.addLast(3);
        Node a4= a.addLast(4);
        Node a5= a.addLast(5);
        a.skiTar(a3);
        a.print();
    }

}