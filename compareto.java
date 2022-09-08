import java.util.*;
public class compareto {
    public static int cmp(String s1,String s2){
        int s1len=s1.length();
        int s2len=s2.length();
        int l1=s1len;
        int l2=s2len;
        int i=0;
        while(s1len!=0 && s2len!=0){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(c1>c2){
                return c1-c2;
            }
            else if(c1<c2){
                return c1-c2;
            }
            else{
                s1len--;
                s2len--;
            }
            i++;
        }
        if(s1len!=0){
            return l1-l2;
        }
        else if(s2len!=0){
            return l1-l2;
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s2=sc.next();
        System.out.println(cmp(s,s2));
    }
}
