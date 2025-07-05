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
    }
}