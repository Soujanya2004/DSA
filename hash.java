import java.util.*;
public class hash {
    public static void major(int [] nums) {
        HashMap<Integer,Integer> count=new HashMap<>();
           for(int i=0; i<nums.length; i++){
            if((count.containsKey(nums[i])==true))
            {
               count.put(nums[i],count.get(nums[i])+1);
            }
            else{
                count.put(nums[i],1);
            } 
           }
            Set<Integer> keys=count.keySet();
            for(Integer key:keys){
                if(count.get(key)>nums.length/3){
                    System.out.println(key);
                }
            }         
    }
  public static void main(String[] args) {
    int [] nums={4,2,1,3,2,1,4,4,5,1,4,4,2,3,4,5};
    major(nums);
  }
}
