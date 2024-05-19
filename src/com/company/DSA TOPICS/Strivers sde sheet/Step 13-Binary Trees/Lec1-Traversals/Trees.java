import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

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
    public static int heightTreeMeth2(Node root){
        if(root==null) return 0;
        int left=heightTreeMeth2(root.left);
        int right=heightTreeMeth2(root.right);
        return Math.max(left,right)+1;
    }
    public static int diameterMeth1(Node root){ // not optimized
        if(root==null) return 0;
        int diam1=diameterMeth1(root.left);
        int diam2=diameterMeth1(root.right);
        int diam3=heightTreeMeth2(root.left)+heightTreeMeth2(root.right)+1;
        return Math.max(diam1,Math.max(diam2, diam3));
    }
    public int[] diameterMeth2(Node root){ // not fully optimized
        if(root==null){
            int arr[]={0,0};
            return arr;
        }
        int left[]=diameterMeth2(root.left);
        int right[]=diameterMeth2(root.right);
        
        int diam1=left[0];
        int diam2=right[0];
        int diam3=left[1]+right[1]+1;
        
        int ans[]=new int[2];
        ans[0]=Math.max(diam1,Math.max(diam2, diam3));
        ans[1]=Math.max(left[1],right[1])+1;
        return ans;
    }
    int path=0;
    public int diameter(Node root){
        if(root==null) return 0;
        int left=diameter(root.left);
        int right=diameter(root.right);
        path=Math.max(left+right,path);
        return Math.max(left,right)+1;
    }
    public int diameterMeth3(Node root){
        diameter(root);
        return path;
    }
    static class Pair{
        Node node;
        int index;
        Pair(Node node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public static ArrayList<Integer> topView(Node root){
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();    
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair currNode=q.remove();
            if(!map.containsKey(currNode.index)) map.put(currNode.index,currNode.node.data);
            if(currNode.node.left!=null) q.add(new Pair(currNode.node.left,currNode.index-1));
            if(currNode.node.right!=null) q.add(new Pair(currNode.node.right,currNode.index+1));
        }
        ArrayList<Integer> topViewElems=new ArrayList<>();
        for(Map.Entry<Integer,Integer> ele:map.entrySet()) topViewElems.add(ele.getValue());
        return topViewElems;   
    }
    public static ArrayList<Integer> bottomView(Node root){
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();    
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair currNode=q.remove();
            map.put(currNode.index,currNode.node.data);
            if(currNode.node.left!=null) q.add(new Pair(currNode.node.left,currNode.index-1));
            if(currNode.node.right!=null) q.add(new Pair(currNode.node.right,currNode.index+1));
        }
        ArrayList<Integer> bottomViewElems=new ArrayList<>();
        for(Map.Entry<Integer,Integer> ele:map.entrySet()) bottomViewElems.add(ele.getValue());
        return bottomViewElems;   
    }
    public static void leftView(Node root,ArrayList<Integer> list,int level){
        if(root==null) return;
        if(list.size()==level) list.add(level,root.data);
        leftView(root.left,list,level+1);
        leftView(root.right,list,level+1);
    }
    public static void rightView(Node root,ArrayList<Integer> list,int level){
        if(root==null) return;
        if(list.size()==level) list.add(level,root.data);
        rightView(root.right,list,level+1);
        rightView(root.left,list,level+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt=new BinaryTree();
        Node tree=bt.BuildTree(arr);
        ArrayList<Integer> al=new ArrayList<>();
        leftView(tree,al,0);
        System.out.println(al);
    }
}