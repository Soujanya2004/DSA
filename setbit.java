public class setbit {
    public static void main(String[] args) {
        int i=2;  //bit position that has to be set
        int n=1<<i; //00000100 shift 1 to left by 2
        System.out.println(n|10); //sets to 1 if 0 in 2nd bit position
    }
}
