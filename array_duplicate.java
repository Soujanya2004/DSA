public class array_duplicate {
    public static void duplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicates found");
                    return;
                }
            }
        }
        System.out.println("not found duplicates");
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,8,1};
        duplicate(arr);
    }
}
