public class reverseLL { 
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addNode(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        newnode.next=head;
        head=newnode;
        
        System.out.println("Node added with data: " + data);
    }
    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;

    }
    //check if ll is palandrome

    public Node midNode(Node head){
       
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void palindrome(){
        //step1 find mid and reverse half of the linked list
        Node mid=midNode(head);
        Node prev=null;
        Node curr=mid;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //step2 compare 1st and 2nd half
        Node left=head;
        Node right=prev; //last node of reversed half
        while( left!=null){
          if(left.data !=right.data){
            System.out.println("Not a palindrome");
            return;
          }
          left=left.next;
            right=right.next;
        }
            
            System.out.println("Is a palindrome");
    }      
    public static void main(String[] args) {
        reverseLL ll = new reverseLL();
        ll.addNode(1);
        ll.addlast(2);
        ll.addlast(1);
        ll.palindrome();
    }    
}
