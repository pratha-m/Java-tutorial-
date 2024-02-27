class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLinkedList{
    public static Node insertAtHead(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }
    public static Node insertAtEnd(Node head,int data){
        Node temp=new Node(data);
        Node tail=head;
        while(tail.next!=null) tail=tail.next;
        tail.next=temp;
        return head; 
    }
    public static void printLinkedlist(Node head){
          while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
          }
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head=insertAtHead(head,2);
        head=insertAtHead(head,3);
        head=insertAtHead(head,4);
        head=insertAtEnd(head, 5);
        head=insertAtEnd(head, 6);
        head=insertAtEnd(head, 7);
        printLinkedlist(head);
    }
}