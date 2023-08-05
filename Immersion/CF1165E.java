import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CF1165E {
    public static void main(String[] args) {
        long mod=998244353;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            long x=sc.nextLong();
            a[i]=x*(i+1)*(n-i);
        }
        Long b[]=new Long[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextLong();
        }
        
        long ans=0;
        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());
        for(int i=0;i<b.length;i++){
            ans=ans+(((a[i]%mod)*b[i])%mod);
            ans%=mod;
        }
        System.out.println(ans);
    }
}
