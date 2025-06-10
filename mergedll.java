public class mergedll {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addFirst(int data){
       Node newnode=new Node(data);
       if(head==null){
        head=newnode;
        tail=newnode;
       }
       else{
        newnode.next=head;
        head=newnode;
       }
    }
    //MERGESORT the ll
    //step 1 find mid node
    public static Node midnode(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //step2 split the ll into two halves
    //step3 sort both halves
    //step 4 merge both halves
    public static Node merge(Node left, Node right){
        Node mergedll=new Node(-1); //dummy node 
        Node temp=mergedll; //for sorted head tracking
        Node lefthead=left;
        Node righthead=right;
        //until any side is null
        while(lefthead!=null && righthead!=null){
            if(lefthead.data<=righthead.data){
               temp.next=lefthead;
               lefthead=lefthead.next;
               temp=temp.next;
            }
            else{
               temp.next=righthead;
               righthead=righthead.next;
               temp=temp.next;
            }
        }
        while(lefthead!=null){
            temp.next=lefthead;
               lefthead=lefthead.next;
               temp=temp.next;
        }
        while(righthead!=null){
            temp.next=righthead;
               righthead=righthead.next;
               temp=temp.next;
        }
        return mergedll.next; // bcz starts with -1
    }
    public static Node mergesort(Node head){
        if(head==null || head.next==null){
            return head; //base case
        }
        Node mid=midnode(head);
        Node righthead=mid.next; //right half starts from mid.next
        mid.next=null;
        Node right=mergesort(righthead);
        Node left=mergesort(head);
        return merge(left,right);

    }
    public static void main (String[] args) {
        addFirst(5);
        addFirst(3);
        addFirst(8);
        addFirst(1);
        addFirst(4);
        //4-1-8-3-5
        Node sortedHead = mergesort(head);
        // Print sorted linked list
                Node current = sortedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); 

    }
}
