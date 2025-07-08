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
    public static int diameter(Node root){  //O(n2)
        if(root==null){
            return 0;
        }
        int ld=diameter(root.left); //starting from left node
        int rd=diameter(root.right); //right node
        int lh=height(root.left);
        int rh=height(root.right);
        int selfdiameter = lh + rh + 1;
        return Math.max(selfdiameter, Math.max(ld, rd)); 
    }

//approach2
public static class Info{
    int diam;
    int ht;
    public Info(int diam,int ht){
        this.diam=diam;
        this.ht=ht;
    }
}
//O(n)
public static Info diameter2(Node root){
    if(root==null){
        return new Info(0, 0); //diameter and height is 0 for leaf node
    }
    Info leftinfo=diameter2(root.left);
    Info rightinfo=diameter2(root.right);

    int diam=Math.max(Math.max(leftinfo.diam, rightinfo.diam),leftinfo.ht + rightinfo.ht + 1);
    int ht=Math.max(leftinfo.ht, rightinfo.ht) + 1;
    return new Info(diam,ht);
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
        System.out.println("Diameter of the tree (using Info class): " + diameter2(root).diam);
    }
}