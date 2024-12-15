public class inverted_tri {
    public static void num_tri(int n) {
        for(int i=1;i<=n;i++) {
            //num
            for(int j=1;j<=n-i+1;j++) {   //till-> 5-2+1=4, 5-3+1=3, 5-4+1=2 
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        num_tri(5);
    }
}
