import java.util.Stack;
public class nextgreater {
    public static void greater(int[] arr, int[] result){
        Stack<Integer> s=new Stack<>();
        s.push(arr[arr.length-1]);
        result[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                result[i]=-1;
            }
            else{
                result[i]=s.peek();
            }
            s.push(arr[i]);
        }
       }
    public static void main(String[] args) {
        int[] arr = {6, 7, 2, 3, 8};
        int[] result = new int[arr.length];
        greater(arr,result);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
