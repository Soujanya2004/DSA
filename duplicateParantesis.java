import java.util.Stack;
public class duplicateParantesis {
    public static boolean checkDuplicateParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                // Check stack is not empty before peeking
                while (stack.peek() != '(') {
                    count++;
                    stack.pop();
                }
                if (count <= 1) {
                    return true;
                }
            } else {
                // opening or operands
                stack.push(ch);
            }
        }
        // Return false if no duplicate parenthesis found
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(checkDuplicateParenthesis(str));
    }
}
