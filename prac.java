import java.util.*;
public class prac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
            if(min>ar[i]){
                min=ar[i];
            }
            if(max<ar[i]){
                max=ar[i];
            }
        }
        int avg=sum/ar.length;
        int dif[]=new int[3];
        for(int i=0;i<ar.length;i++){
            if(Math.abs(min-ar[i])>dif[0]){
                dif[0]=Math.abs(min-ar[i]);
            }
            if(Math.abs(max-ar[i])>dif[1]){
                dif[1]=Math.abs(max-ar[i]);
            }
            if(Math.abs(avg-ar[i])>dif[2]){
                dif[2]=Math.abs(avg-ar[i]);
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            ans=Math.min(ans,dif[i]);
        }
        System.out.println(ans);
    }
}
