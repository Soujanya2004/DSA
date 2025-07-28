class palindrome_sum {
    public static void palindrome(int num){
        
        int sum=num+reverse(num);
        int res=reverse(sum);
        if(sum==res){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }
    public static int reverse(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+(num%10);
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        palindrome(125);
    }
}


