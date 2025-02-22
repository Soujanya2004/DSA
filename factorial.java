public class factorial {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            n=n*fact(n-1);
        }
        return n;
    }
    public static void main(String[] args) {
        int n=5;
        int res=fact(n);
        System.out.println(res);
    }
}
