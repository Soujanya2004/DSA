public class binary {
    public static int dec(int binNum){
           int pow=0;
           int dec=0;
           while(binNum>0){
             int ld=binNum%10;
             dec=dec+(ld*(int)Math.pow(2,pow));
             pow++;
             binNum=binNum/10;
           }
           return dec;

    }
    public static void main(String args[])
    {
        System.out.println(dec(1111));
    }
}