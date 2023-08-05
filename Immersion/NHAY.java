import java.util.*;
public class NHAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            String pt=sc.next();
            String text=sc.next();
            LPS(text, pt);
            
        }
    }
    public static void LPS(String text,String pt){
        String str=pt+"#"+text;
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
        for(int j=pt.length();j<dp.length;j++){
            if(dp[j]==pt.length()){
                System.out.println(dp[i]-2*pt.length());
            }
        }
    }
}
