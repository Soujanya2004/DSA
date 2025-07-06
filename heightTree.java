import java.util.*;
public class heightTree{
    public static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    //number of leaves in the longest path
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int selfdiameter = ld + rd + 1;
        return Math.max(selfdiameter, Math.max(ld, rd)); 
    }
    
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh) + 1;  //longest height
    }

    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        return lc + rc + root.data;  //+1 for count of nodes and +root.data for sum of all nodes
    }

    public static void main(String[] args) {
        // Example usage
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        System.out.println("Height of the tree: " + height(root));
        System.out.println("Count of nodes in the tree: " + count(root));
        System.out.println("Diameter of the tree: " + diameter(root));
    }
}