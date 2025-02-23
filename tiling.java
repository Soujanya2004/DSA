//floor size 2*n, tile size 2*1
public class tiling {
    public static int tilingways(int n){
       if(n==0 || n==1){
        return 1;
       }
       int total =tilingways(n-2)+tilingways(n-1);
       return total;
    }
    public static void main(String[] args) {
        int n=4;
        int res=tilingways(n);
        System.out.println(res);
    }
}
