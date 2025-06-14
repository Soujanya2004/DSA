import java.util.*;
public class reverseStringStack {
    public static StringBuilder reverse(String str){
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result;

    }
    public static void main(String[] args) {
        String str="sonu";
        StringBuilder res= reverse(str);
        System.out.println("original string: " + str);
       System.out.println("reversed string: ");
        for(int i=0;i<res.length();i++){
            System.out.print(res.charAt(i));
        }
    }
}
