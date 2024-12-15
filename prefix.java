public class prefix {
    public static void prefixsubarray(int arr[]){
        //  int newarr[];
         int sum=0;
         for(int i=0;i<arr.length;i++){
           for(int j=i;j<arr.length;j++){
              sum=arr[i]+arr[j];
           }
         }
         System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        prefixsubarray(arr);
    }
}
