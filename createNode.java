public class createNode {
    public static class Node {
        int data;
        Node next;
        public Node(int data){  //constructor
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addData(int data){  //function to add node+data
        Node newNode= new Node(data);
        if(head==null){
            head =newNode;
            tail =newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
    }
    public static void addmiddle(int data,int position){
        Node newnode =new Node(data);
        Node temp=head;
        for(int i=0;i<position-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public static int size(){
        int count=0;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public static void removefirst(){
        if(head==null){
            return;
        }//no node present
        if(head==tail){
            head=null;
            tail=null;
        } //only 1 node
      head=head.next;
    }
    public static void removelast(int size){
        int prev=size-2;
        Node temp=head;
        for(int i=0;i<=prev;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    public static void main(String[] args) {
        addData(1);
        addData(2);       
        addlast(3);
        addmiddle(9,1);
        int size=size();  //or create object for ll and define static variable called size and size++ at every new node creation
        removefirst();
        removelast(size);
        print();
        System.out.println(size);;
        
    }
}
