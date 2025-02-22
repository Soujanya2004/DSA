public class recurse {
    public static int fun1(int n){
        if(n==0){
            return n;
        }
        else{
            return n+fun1(n-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        int res=fun1(n);
        System.out.println(res);
    }
}
