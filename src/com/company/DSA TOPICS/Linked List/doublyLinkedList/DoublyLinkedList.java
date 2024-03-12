class Node{
    int data;
    Node next;
    Node back;
    Node(int data,Node next,Node back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
    Node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}
public class DoublyLinkedList {
    public static Node convertArrToDLL(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        } 
        return head;
    }
    public static Node deleteHeadNode(Node head){
        if(head==null || head.next==null) return null;
        Node prev=head;
        head=head.next;   
        prev.next=null;
        head.back=null;
        return head;
    }
    public static Node deleteTailNode(Node head){
        if(head==null || head.next==null) return null;
        Node tail=head;
        while(tail.next!=null) tail=tail.next;
        Node prev=tail.back;
        tail.back=null;
        prev.next=null;
        return head;
    }
    public static Node deleteKthNode(Node head,int k){
        if(head==null || head.next==null) return null;
        Node temp=head;
        int i=1;
        while(i!=k){
            temp=temp.next;
            i++;
        }
        Node prev=temp.back;
        Node forward=temp.next;
        if(prev==null && forward==null) return null;
        else if(prev==null) return deleteHeadNode(head);
        else if(forward==null) return deleteTailNode(head);
        prev.next=forward;
        forward.back=prev;
        temp.next=null;
        temp.back=null;
        return head; 
    }
    public static void printLinkedlist(Node head){
        while(head!=null){
          System.out.print(head.data+" ");
          head=head.next;
        }
        System.out.println();
   }
    public static void main(String[] args) {
        int arr[]={1,5,6,7,8};
        Node head=convertArrToDLL(arr);
        printLinkedlist(head);
        head=deleteKthNode(head,6);
        printLinkedlist(head);
    }
}
