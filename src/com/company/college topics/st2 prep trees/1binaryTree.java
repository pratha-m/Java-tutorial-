class Node{
    int Data;
    Node left,right;
    Node(int Data){
        this.Data=Data;
        left=null;
        right=null;
    }
}
class BinaryTree{
    Node root;
    public BinaryTree(){
        root=null;
    }
    public void insert(int data){
       root=insertRecursive(root,data);
    }
    private Node insertRecursive(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.Data){
            root.left=insertRecursive(root.left,data);
        }else if(data>root.Data){
            root.right=insertRecursive(root.right,data);
        }
        return root;
    }
    public void inorderTraversal(){
        inorderTraversalRecursive(root); 
    }
    private void inorderTraversalRecursive(Node root){
        if(root!=null){
            inorderTraversalRecursive(root.left);
            System.out.println(root.Data+" ");
            inorderTraversalRecursive(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();

        tree.insert(5); 
        tree.insert(10); 
        tree.insert(15); 
        tree.insert(20); 
        tree.insert(25); 
        tree.insert(30); 

        tree.inorderTraversal();
    }
}