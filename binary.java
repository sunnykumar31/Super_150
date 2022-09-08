import java.util.*;
public class binary {
    static long bin(int n,int base){
        long sum=0;
        int i=0;
        while(n!=0){
            int rem=n%base;
            sum=sum+rem*(long)Math.pow(10,i);
            i++;
            n=n/2;
        }
        return sum;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(bin(n,base));
        
    }
}