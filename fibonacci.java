public class fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibn1 = fib(n - 1);
        int fibn2 = fib(n - 2);
        return fibn1 + fibn2;
    }

    public static void main(String[] args) {
        int n = 9;
        int res = fib(n);
        System.out.println(res);
    }
}
