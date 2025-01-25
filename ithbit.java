public class ithbit {
    public static void main(String[] args) {
        int i=1;//00000001
        int bitmask=1<<i;
        int n=3;  //00000011
        if((n & bitmask) == 0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
}
