import java.util.*;
public class disjoint {
    public static void main(String[] args) {
    //define start and end times of tasks
    int stime[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};
    ArrayList<Integer> ans =new ArrayList<>();
    int count=0;
    //take 1st activity 
    count=1;
    ans.add(0);
    int endtime=end[0];
    for(int i=1;i<stime.length;i++){
        if(endtime<=stime[i]){
            ans.add(i);
            count++;
            endtime=end[i];
        }
    }
    System.out.println("Maximum number of activities: " + count);
    System.out.print("Activities: ");
    for(int j=0;j<=count-1;j++){
        System.out.print("A"+(ans.get(j)+1)+" ");
    }
    }
}
