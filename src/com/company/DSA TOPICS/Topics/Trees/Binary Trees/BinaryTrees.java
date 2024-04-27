import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTrees{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1) return null;
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;    
        }
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()) break;
                else q.add(null); 
            } 
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
            }
        }
    }
    public static int countOfNodes(Node root){
        if(root==null) return 0;
        int leftNodes=countOfNodes(root.left);
        int rightNodes=countOfNodes(root.right);
        return leftNodes+rightNodes+1;
    }
    public static int sumOfNodes(Node root){
        if(root==null) return 0;
        int leftNodesSum=sumOfNodes(root.left);
        int rightNodesSum=sumOfNodes(root.right);
        return leftNodesSum+rightNodesSum+root.data;
    }
    public static int heightOfTree(Node root){
        if(root==null) return 0;
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        int maxHeight=Math.max(leftHeight,rightHeight);
        return maxHeight+1;
    }
    public static int diameter(Node root){
       if(root==null) return 0;
       int diam1=diameter(root.left);   
       int diam2=diameter(root.right);
       int diam3=heightOfTree(root.left) + heightOfTree(root.right) + 1; 
       int maxDiam=Math.max(diam3,Math.max(diam1, diam2));
       return maxDiam;  
    }
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null) return new TreeInfo(0, 0);

        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);

        int myHeight=Math.max(left.ht,right.ht) + 1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht + right.ht + 1;

        int myDiam=Math.max(Math.max(diam1,diam2), diam3);

        TreeInfo myInfo=new TreeInfo(myHeight,myDiam);
        
        return myInfo;
    }
    public static boolean isIdentical(Node root,Node subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null || subRoot==null){
            return false;
        }
        if(root.data==subRoot.data){
             return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
        }
        return false;
    }
    public boolean isSubtree(Node root,Node subRoot){
        if(subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)) return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot); 
    }
    public static int kthLevelSum(Node root,int k){
        if(root==null) return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int count=0;
        int sum=0;
        while(!q.isEmpty()){
            Node ele=q.remove();
            if(ele==null){
                count++;
                if(count==k) break;
                if(q.isEmpty()) break;
                else q.add(null);
            }
            else{
                if(count==k-1) sum+=ele.data;
                if(ele.left!=null) q.add(ele.left);
                if(ele.right!=null) q.add(ele.right);
            }   
        }
        return sum;
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(kthLevelSum(root,1));
    } 
}