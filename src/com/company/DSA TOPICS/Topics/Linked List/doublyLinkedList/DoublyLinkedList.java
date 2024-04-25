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
        if(head==null) return null;
        Node temp=head;
        int i=0;
        while(temp!=null){
            i++;
            if(i==k) break;
            temp=temp.next;
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
    public static void deleteNode(Node temp){
        Node prev=temp.back;
        Node front=temp.next;

        if(front==null){
            prev.next=null;
            temp.back=null;
            return;
        }
        prev.next=front;
        front.back=prev;
        temp.next=null;
        temp.back=null;
    }
    public static Node insertBeforeHead(Node head,int data){
        Node newHead=new Node(data,head,null);
        head.back=newHead;
        return newHead;
    }
    public static Node insertBeforeTailNode(Node head,int data){
        if(head==null) return new Node(data,null,null);
        if(head.next==null) return insertBeforeHead(head,data);    
        Node tailNode=head; 
        while(tailNode.next!=null) tailNode=tailNode.next;
        Node prev=tailNode.back;
        Node insertNode=new Node(data,tailNode,prev);
        prev.next=insertNode;
        tailNode.back=insertNode;
        return head;
    }
    public static Node insertBeforekthNode(Node head,int data,int k){
        if(k==1) return insertBeforeHead(head,data);
        Node temp=head;
        int ind=0;
        while(temp!=null){
            ind++;
            if(ind==k) break;
            temp=temp.next; 
        }
        Node prev=temp.back;
        Node newNode=new Node(data,temp,prev);
        prev.next=newNode;
        temp.back=newNode;
        return head;
    }
    public static void insertBeforeGivenNode(Node node,int data){
        Node prev=node.back;
        Node newNode=new Node(data,node,prev);
        prev.next=newNode;
        node.back=newNode;
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
        insertBeforeGivenNode(head.next,10);
        printLinkedlist(head); 
    }
}
 