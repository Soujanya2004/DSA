public class occurance {
    public static void indexOccur(int arr[], int key, int i){
        if (i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        indexOccur(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,5,2,6,2};
        indexOccur(arr,2,0);
    }
}
