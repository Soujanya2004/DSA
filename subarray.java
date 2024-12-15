public class subarray {
    public static void sub(int num[]) 
    {
    for(int i=0;i<num.length;i++) { //start
        for(int j=i;j<num.length;j++) {
            System.out.print("["); //end
            int sum=0;
            for(int k=i;k<=j;k++) { 
                   sum=sum+num[k];   //print
                  System.out.print(num[k]+" ");
                }
                System.out.println("] "+"sum="+sum);
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};
        sub(num);
    }
}
