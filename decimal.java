public class decimal {

public static void dec(int n) {
    int pow=0;
    int bin=0;
    int rem=0;
    while(n>0){
        rem=n%2;
        n=n/2;
        bin=bin+(rem*(int)(Math.pow(10,pow)));
        pow++;
    }
    System.out.println(bin);;
}
public static void main(String[] args) {
    dec(15);
  }
}

