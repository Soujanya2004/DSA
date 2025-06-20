public class queuell {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void add(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public static void delete(){
        if(head==null){
            System.out.println("Queue is empty");
            return;
        }
        else{
            head=head.next;
        }

    }
    public static void display(){
        Node current=head;
        if(head==null){
            System.out.println("Queue is empty");
            return;
        }
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queuell q=new queuell();
        q.add(10);
        q.add(20);  
        q.add(30);
        q.add(40);
        q.display();
        q.delete();
        q.display();
        q.add(1);
        q.display();

        q.delete();
        q.display();
    }
}
