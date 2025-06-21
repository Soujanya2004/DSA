import java.util.*;
public class queuerev {
    public static void reverse(Queue<Integer> queue){
       while(queue.isEmpty()){
            return;
       }

       int front = queue.poll(); // Remove the front element
       reverse(queue); // Recursively reverse the remaining queue
       queue.add(front);
    }
    public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            reverse(queue);
            // Display the reversed queue
            while(!queue.isEmpty()){
                System.out.print(queue.poll() + " ");
            }
       
    }
}
