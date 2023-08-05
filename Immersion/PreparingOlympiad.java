import java.util.*;
public class PreparingOlympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int x=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println(countContest(ar,l,r,x));
    }
    public static int countContest(int ar[],int l,int r, int x){
        int n=ar.length;
        int ans=0;
        for(int i=3;i<(1<<n);i++){
            if(countBits(i)>=2){
                if(isItPossible(ar,l,r,x,i)){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static int countBits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
    public static boolean isItPossible(int ar[],int l,int r, int x,int i){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int pos=0;
        int sum=0;
        while(i>0){
            if((i&1)==1){
                sum+=ar[pos];
                min=Math.min(min,ar[pos]);
                max=Math.max(max,ar[pos]);
            }
            pos++;
            i>>=1;
        }
        return l<=sum & sum<=r & (max-min)>=x;
    }
}
