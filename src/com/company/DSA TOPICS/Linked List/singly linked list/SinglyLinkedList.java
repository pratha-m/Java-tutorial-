class Node{
    public
      int data;
      Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }  
}
class LinkedList{
    Node head;
    Node tail;
    public void insertAtHead(int d){
        Node temp=new Node(d);
        temp.next=head;
        head=temp;
    }
    public void insertAtTail(int d){
        Node temp=new Node(d);
        tail.next=temp;
        tail=temp;
    }
    public void printLinkedList(){
      Node temp=head;
      while(temp!=null){
          System.out.print(temp.data+" ");
          temp=temp.next;
      }
    }
}
public class SinglyLinkedList{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.printLinkedList();
    }
}