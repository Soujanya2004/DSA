import java.util.Stack;
public class stockSpan {
    public static void calculateStockSpan(int[] prices, int[] span) {
      span[0]=1;
      Stack<Integer> s=new Stack<>();
      s.push(0);    
      //span =i-prevhigh
      for(int i=1;i<prices.length;i++){
         while(!s.isEmpty() && prices[i]>prices[s.peek()]){
            s.pop();
         }
         if(s.isEmpty()){
            span[i]=i+1;
         }
         else{
            span[i]=i-s.peek();
         }
         s.push(i);
      }
    }
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 100};
        int[] spans = new int[prices.length];
        calculateStockSpan(prices,spans);
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}
