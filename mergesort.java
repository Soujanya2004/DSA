public class mergesort{
    public static void mergsort(int arr[],int si, int ei){
           if(si>=ei){
            return;
           }
           int mid=si+(ei-si)/2;
           mergsort(arr, si, mid);
           mergsort(arr, mid+1, ei);
           merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int i=si; //left
        int j=mid+1; //right
        int k=0;
        int temp[]=new int[ei-si+1];
        
        //check for smallest of both left and right
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left single
        while(i<=mid){
            temp[k]=arr[i];
                i++;
                k++;
        }
        //right single
        while(j<=ei){
            temp[k]=arr[j];
                j++;
                k++;
        }
        //copy temp to arr
        for(int x=0; x<temp.length;x++){
            arr[si+x]=temp[x];
         }

    }
    public static void main(String[] args) {
        int arr[]={2,4,1,6,9,8};
        int si=0;
        int ei=arr.length-1;
        mergsort(arr,si,ei);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
}