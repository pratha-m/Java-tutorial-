class Node{
    int data;
    Node next;
    Node(int data){
       this.data=data;
    }
}
public class MiddleOfLinkedList{
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
    public static Node middle(Node head){
        if(head==null || head.next==null) return head;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        head=addNode(4,head);
        head=addNode(3,head);
        head=addNode(2,head);
        head=addNode(1,head);
        printList(head);
        //  tortoise and hars
        System.out.println(middle(head).data);
    }
}