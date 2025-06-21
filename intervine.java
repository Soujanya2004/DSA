import java.util.*;
public class intervine {
    public static void interleve(Queue<Integer> q){
      int mid=q.size()/2;
      Queue<Integer> q1=new LinkedList<>();
      for(int i=0;i<mid;i++){
        q1.add(q.poll());
      }
      while(!q1.isEmpty()){
        q.add(q1.poll());
        q.add(q.poll());
      }
      //display the interleaved queue
      while(!q.isEmpty()){
        System.out.print(q.poll()+" ");
      }
      
    }
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        interleve(q);
    }
}
