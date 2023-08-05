import java.util.*;
public class LongestPrefixSufix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
    }
    public static String LPS(String str){
        int dp[]=new int[str.length()];
        int len=0;
        int i=1;
        while(i<dp.length){
            if(str.charAt(len)==str.charAt(i)){
                len++;
                dp[i]=len;
                i++;
            }
            else{
                if(len>0){
                    len=dp[len-1];
                }
                else{
                    dp[i]=0;
                    i++;
                }
            }
            
        }
        return str.substring(0,dp[str.length()-1]);
    }
}