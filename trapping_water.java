public class trapping_water {
    //to find the max right bar
    public static int[] max_border_right(int b[]){
        int maximum=0;
        int[] max_boundry=new int[b.length];
        for(int i=0;i<b.length;i++){
            maximum=Math.max(b[i],maximum);
            max_boundry[i]=maximum;
        }
        return max_boundry;
    }
    //to find the max left bar
    public static int[] max_border_left(int b[]){
        int maximum=0;
        int[] max_boundry=new int[b.length];
        for(int i=b.length-1;i>=0;i--){
            maximum=Math.max(b[i],maximum);
            max_boundry[i]=maximum;
        }
        return max_boundry;
    }
    //to find the min of right and left bar
    public static int[] min(int max_border_right[], int max_border_left[]){
        int minimum[] =new int[max_border_right.length];
        for(int i=0;i<max_border_right.length;i++){
             minimum[i]=Math.min(max_border_left[i], max_border_right[i]);
        }
        return minimum;
    }
    //to find the volume of water trapped in total
    public static void main(String[] args) {
        int arr[]={3,2,4,3,0,6};
        int[] max_border_right=max_border_right(arr);
        int[] max_border_left=max_border_left(arr);
        int traped_water[]=min(max_border_right, max_border_left);
        int volume=0;
        for(int i=0;i<arr.length;i++) {
            volume=volume+(traped_water[i]-arr[i]);           
        }
        System.out.println(volume);
    }
}
