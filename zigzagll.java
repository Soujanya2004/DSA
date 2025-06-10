public class zigzagll {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    // Function to rearrange the linked list in zigzag fashion
    //step1 find mid node
    public static Node midnode(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //step2 split into 2 halfs
    //step3 reverse second half
    //step4 merge both halves in zigzag manner
    public static void zigzag(){
      Node mid=midnode(head);
      Node prev=null;
      Node curr=mid.next;
      while(curr!=null){
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      mid.next=null;
      Node nextleft;
      Node nextright;
      Node lefthead=head;
      Node righthead=prev; //prev has last node of reversed second half
      while(lefthead!=null && righthead!=null){
        nextleft=lefthead.next;
        lefthead.next=righthead;
        nextright=righthead.next;
        righthead.next=nextleft;
        //update heads
        lefthead=nextleft;
        righthead=nextright;
        
      }
    }
    public static void main(String[] args) {
        addFirst(6);
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addFirst(5);
        
        zigzag();
        
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
}
