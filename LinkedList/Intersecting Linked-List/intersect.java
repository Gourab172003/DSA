public class intersect{

 static class Node{
    int data;
    Node next;
  }


  public static void intersect(Node head1, Node head2){
   
  Node temp1 = head1;
Node temp2 = head2;

while(temp1 != temp2)
{
    if(temp1 == null)
        temp1 = head1;
    else
        temp1 = temp1.next;

    if(temp2 == null)
        temp2 = head2;
    else
        temp2 = temp2.next;
}

System.out.println(temp1.data);
}



  public static void main (String args[])
  {
         Node node4 = new Node();
        node4.data = 4;

        Node node3 = new Node();
        node3.data = 3;
        node3.next = node4;

        Node node2 = new Node();
        node2.data = 2;
        node2.next = node3;

        Node head1 = new Node();
        head1.data = 1;
        head1.next = node2;

        Node head2 = new Node();
        head2.data = 5;
        head2.next = node3;
        intersect(head1, head2);

          Node node21 = new Node();
        node21.data = 7;
        node21.next = head2;
  }
}