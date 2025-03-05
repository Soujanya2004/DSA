public class findpermutation {
    public static void permutation(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }  
         //recursion or no. of possible ways of fillimg that space
        for(int i =0;i<str.length();i++){
            char ch=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1,str.length());
            permutation(newstr, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        permutation(str, ans);       
    }
}
