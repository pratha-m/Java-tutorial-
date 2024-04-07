class Node{
    int data;
    Node next;
    Node(int data){
       this.data=data;
    }
}
public class ReverseLinkedList{ 
    public static Node addNode(int data,Node head){ 
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head; 
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node reverseUsingRec(Node head){
        if(head==null || head.next==null) return head;
        Node newHead=reverseUsingRec(head.next);
        Node front=head.next;
        // System.out.println("New Head :"+newHead.data); // debug
        // System.out.println("head : "+head.data);// debug
        // System.out.println("Front  :"+front.data);// debug
        front.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head=addNode(4,head);
        head=addNode(3,head);
        head=addNode(2,head);
        head=addNode(1,head);
        printList(head);
        head=reverseUsingRec(head);
        printList(head);
    }
}
