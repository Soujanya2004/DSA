public class string_compression {
    public static void count(String str){
        int count=1;
        StringBuilder newstr = new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                newstr.append(str.charAt(i));
                newstr.append(count);
                count=1;
            }
            
        }
        newstr.append(str.charAt(str.length() - 1)); //for last char append
        newstr.append(count);  //default count is 1 for last char
        System.out.println(newstr);
    }
    public static void main(String[] args) {
       String str="aaaabbbcc";
       count(str);
    }
}
