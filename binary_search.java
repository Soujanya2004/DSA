public class binary_search {
    public static int bin(int arr[],int key){
        int st=0;
        int en=arr.length-1;
        while(st<=en){ 
            int mid=(st+en)/2;
            if(arr[mid]==key){ //found
                return mid;
            }
            if(arr[mid]<key){  //left
                st=mid+1;
            }
            else{
                en=mid-1;  //present on right of array
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,20,10,5,90,37};
        System.out.println("FOUND AT "+bin(arr,2)+" INDEX");

    }
}
