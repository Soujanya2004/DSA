import java.util.*;
public class pushtobottom {
    public static void pushlast(Stack<Integer> stack,int data){
        if(stack.isEmpty()){
            stack.push(data);  //push data to last
            return;
        }
        int top=stack.pop(); //remove all elements until empty
        pushlast(stack,data); 
        stack.push(top);  //start adding elements back
    }
     public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushlast(stack,4);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        //or system.out.println(stack); //to print the stack directly
    }
}
