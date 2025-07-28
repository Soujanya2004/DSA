
class pangrams {
    public static boolean pangram(String str){
        boolean check[]=new boolean[26];
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
                check[str.charAt(i)-'a']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(check[i]==false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean res=pangram("i am soujanya");
        System.out.print(res);
    }
}