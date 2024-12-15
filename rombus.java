public class rombus {
    public static void tri(int n){
        for(int i=1;i<=n;i++) {
            for(int j=(n-i+1);j>=0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                if(k==1|| k==n || i==1 || i==n){
                    System.out.print("*");
                } 
                else{
                    System.out.print(" ");
                }   
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        tri(4);
    }
}
