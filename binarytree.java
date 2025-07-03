import java.util.*;
public class binarytree {
    //creating a node class
    public static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
         }
    }
    //building tree
    public static class buildtree{
        static int index=-1;
        public static Node build(int arr[]){
            index++;
            if(index>=arr.length || arr[index]==-1){
                return null;
            }
            Node newnode=new Node(arr[index]);   //creating root node
            newnode.left=build(arr);  //recursive call for left subtree
            newnode.right=build(arr);
            return newnode;
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }           
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            int h=0;
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){   //if poped is null
                    System.out.println();
                    h++;
                  if(q.isEmpty()){
                    break;
                  }
                  else{
                    q.add(null);
                  }
                }
                //if poped is a node
                else{  
                    System.out.print(curr.data+"");
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
           System.out.println(h + " is the height of the tree"); 
        }
        }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=buildtree.build(nodes);
        // buildtree.inorder(root);
        // System.out.println("");
        // buildtree.postorder(root);
        buildtree.levelorder(root);
    }
} 
