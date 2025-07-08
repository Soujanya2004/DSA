public class subtree {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static boolean issubtree(Node root, Node subroot){
        //step 1 check if root and subroot data match
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            return isidentical(root,subroot);
        }
        else{
            return issubtree(root.left, subroot) || issubtree(root.right, subroot);
        }
    }

        //step 2 if yes then check if left and right nodes structure are matching - check for false cases
        public static boolean isidentical(Node root, Node subroot){
          if(root==null && subroot==null) {
            return true;
          }
          if(root==null || subroot==null) {
            return false;
          }
          if(root.data!=subroot.data) {
            return false;
          }
          return isidentical(root.left,subroot.left) && isidentical(root.right,subroot.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left= new Node(6);
        root.left.right = new Node(5);


        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        System.out.println(issubtree(root,subroot));
    }
}
