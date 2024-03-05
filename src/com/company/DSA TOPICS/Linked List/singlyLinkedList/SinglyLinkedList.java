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
    public static Node insertAtMiddle(Node head,int data){
        Node temp=new Node(data);
        Node back=head,front=head.next;
        int length=0,index=0;
        while(back!=null){
            length++;
            back=back.next;
        }
        back=head;
        while(index!=length/2-1){
            index++;
            back=back.next;
            front=front.next;
        }
        back.next=temp;
        temp.next=front;
        return head;
    }
    public static Node insertAtEnd(Node head,int data){
        Node temp=new Node(data);
        Node tail=head;
        while(tail.next!=null) tail=tail.next;
        tail.next=temp;
        return head; 
    }
    public static Node deleteHead(Node head){
        head=head.next;
        return head; 
    }
    public static Node deleteEndNode(Node head){
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
        head=insertAtEnd(head,2);
        head=insertAtEnd(head,3);
        head=insertAtEnd(head,4);
        head=insertAtEnd(head, 5);
        head=insertAtEnd(head, 6);
        head=insertAtEnd(head, 7);
        printLinkedlist(head);
        head=deleteHead(head);
        System.out.println();
        printLinkedlist(head);
    }
}