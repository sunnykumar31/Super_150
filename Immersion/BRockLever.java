import java.util.Scanner;
public class BRockLever {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            int n=sc.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++){
                ar[i]=sc.nextInt();
            }
            boolean visited[]=new boolean[n];
            long ans=0;
            for(int i=31;i>=0;i--){
                long c=0;
                for(int j=0;j<n;j++){
                    if(((ar[j])&(1<<i))!=0 && !visited[j]){
                        c++;
                        visited[j]=true;
                    }
                }
                ans=ans+(c*(c-1))/2;
            }
            System.out.println(ans);
        }
    }
}
