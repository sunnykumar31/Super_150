import java.util.*;
public class CountGoodSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Good_Substring(str);

    }
    public static void Good_Substring(String str){
        int ar[][]=new int[2][2];
        long odd=0,even=0;
        for(int i=1;i<=str.length();i++){
            odd++;
            if((i&1)==1){
                odd+=ar[str.charAt(i-1)-'a'][0];
                ar[str.charAt(i-1)-'a'][0]++;
                even+=ar[str.charAt(i-1)-'a'][1];
            }
            else{
                odd+=ar[str.charAt(i-1)-'a'][1];
                even+=ar[str.charAt(i-1)-'a'][0];
                ar[str.charAt(i-1)-'a'][1]++;
            }
            
            
        }
        System.out.println(even+" "+odd);
    }
}
