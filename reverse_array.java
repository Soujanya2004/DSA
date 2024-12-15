

public class reverse_array {
    public static void reverse(int arr[]){
        int len=arr.length;
        int first=0;
        int last=len-1;

       while(first<last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;    //swaping
        first++;
        last--;
       }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
