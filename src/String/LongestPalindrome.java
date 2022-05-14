package String;

public class LongestPalindrome {
    static int lo,maxLen;

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {

        int len = s.length();
        if(len < 2){
            return s;
        }

        for(int i=0;i<len-1;i++){
            extend(s,i,i);
            extend(s,i,i+1);
        }
        return s.substring(lo,lo+maxLen);
    }

    public static void extend(String s, int j, int k) {

        while(j>=0 && k<s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }

        if(maxLen < k-j-1){
            lo = j+1;
            maxLen = k-j-1;
        }
    }
}
