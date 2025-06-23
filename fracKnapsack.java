import java.util.Arrays;
import java.util.Collections;
public class fracKnapsack {
    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;
        int total=0;
        Double[][] ratio = new Double[weights.length][4];
        for(int i=0;i<weights.length;i++){
            ratio[i][0]=Double.valueOf(i); // store index
            ratio[i][1]=values[i]/Double.valueOf(weights[i]); //ratios
            ratio[i][2]=Double.valueOf(weights[i]); // store weight
            ratio[i][3]=Double.valueOf(values[i]); // store value
        }
         Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1])); // descending order

        for(int j=0; j<ratio.length;j++){
            if(capacity==0){
                break;
            }
            if(capacity<ratio[j][2]){
                total = total + (int)(capacity * ratio[j][1]);
                break;
            }
            else{
                 total=total+ratio[j][3].intValue();
                 capacity=capacity-ratio[j][2].intValue();

            }
        }
       System.out.println("Total value in knapsack: " + total);
    }
    
}

