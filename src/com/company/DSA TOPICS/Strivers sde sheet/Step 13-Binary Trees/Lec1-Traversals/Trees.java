import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Trees{
    static class BinaryTree{
        int idx=-1;
        public Node BuildTree(int arr[]){
            idx++;
            if(arr[idx]==-1) return null;
            Node root=new Node(arr[idx]);
            root.left=BuildTree(arr);
            root.right=BuildTree(arr);
            return root;
        }
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    } 
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public static void levelorder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                if(q.isEmpty()) break;
                System.out.println();
                q.add(null);
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
            }
        }
    }
    public static int countNodes(Node root){
        if(root==null) return 0;
        int leftCount=countNodes(root.left);
        int rightCount=countNodes(root.right);
        return leftCount+rightCount+1;
    }
    public static int sumOfNodes(Node root){
        if(root==null) return 0;
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }
    public static int heightTree(Node root){
        if(root==null) return 1;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int height=0;
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                height++;
                if(q.isEmpty()) break;
                q.add(null);
            }
            else{
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
            }
        }
        return height;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt=new BinaryTree();
        Node tree=bt.BuildTree(arr);
        System.out.println(heightTree(tree));
    }
}