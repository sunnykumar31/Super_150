import java.util.*;
public class AvengarEndGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println(count(num,ar));
    }
    public static int count(int num,int ar[]){
        int ans=0;
        for(int i=1;i<(1<<ar.length);i++){
            int c=countNumber(i,num,ar);
            if(countBits(i)%2==0){
                ans-=c;
            }
            else{
                ans+=c;
            }
        }
        return ans;
    }
    public static int countNumber(int i,int num,int ar[]){
        int pod=1;
        int pos=0;
        while(i>0){
            if((i&1)!=0){
                pod*=ar[pos];
            }
            i>>=1;
            pos++;
        }
        return num/pod;
    }
    public static int countBits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
