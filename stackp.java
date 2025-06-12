import java.util.ArrayList;
public class stackp {
     static class stack{
       ArrayList<Integer> list = new ArrayList<>();
       public boolean isempty(){
        return list.size()==0;
       }
          public void push(int data){
            list.add(data);
          }
          public int pop(){
             if(isempty()){
                return -1;
             }
             int top=list.get(list.size()-1);
             list.remove(list.size()-1);
             return top;
          }
          public int peek(){
            if(isempty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
          }
          public int size(){
            return list.size();
          }
          public static void main(String args[]){
            stack s=new stack();
            s.push(1);
            s.push(2);
            s.push(3);
            int deleted=s.pop();
            System.out.println("Deleted element: " + deleted);
            System.out.println("Top element: " + s.peek());
            while(!s.isempty()){
                System.out.println(s.peek());
                s.pop();
            }
            
          }
    }
}
