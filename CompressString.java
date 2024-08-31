public class CompressString {
    public static String compressString(String str){
        String ans="";
        int n=str.length();
        if(n==0){
            return ans;
        }
        int currentCharCount=1;
        ans+=str.charAt(0);
        for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt( i-1)){
                ++currentCharCount;
            }
            else{
                if(currentCharCount>1){
                    ans+=currentCharCount;
                    currentCharCount=1;
                }
                ans+=str.charAt(i);
            }
            
        }
        if(currentCharCount>1){
            ans+=currentCharCount;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="aaaaabbbdddghha";
        System.out.println(compressString(str));
    }
}
