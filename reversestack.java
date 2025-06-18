import java.util.Stack;
public class reversestack {
public static void pushlast(Stack<Integer> stack,int top){
    if(stack.isEmpty()){
        stack.push(top);
        return;
    }
      int temptop=stack.pop();
      pushlast(stack,top);
      stack.push(temptop);
}
    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top=stack.pop();
        reverseStack(stack); 
        pushlast(stack,top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println("Original Stack: " + stack);
        
        reverseStack(stack);
        
        System.out.println("Reversed Stack: " + stack);
    }
}
