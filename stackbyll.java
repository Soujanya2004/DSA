//implementing stack using linked list
public class stackbyll {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        static node head=null; //acts as the top of the stack
        public boolean isempty(){
            return head==null;
        }
        public void addnode(int data) { //push
          node newnode=new node(data);
          if(head==null){
            head=newnode;
          }else {
            newnode.next=head;
            head=newnode; 
           } 

        }
        public int pop(){
            if(isempty()){
                return -1;
            }
            int top=head.data;
            head=head.next; //move head to the next node
            return top; //removed data
        }
        public int peek(){
            if(isempty()){
                return -1;
            }
            int top=head.data;
            return top;
        }
      }
      public static void main(String[] args) {
        stack s=new stack();
        //Stack<Integer> s=new Stack<>();     using java collections(delete stack class), import all
        s.addnode(1);
        s.addnode(2);
        s.addnode(3);
        s.addnode(4);
        int deleted=s.pop();
        System.out.println("Deleted element: " + deleted);
        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }       
    }
}
