import java.util.Scanner;

public class CatalanNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(catalan(n));

    }
    public static int catalan(int n){
        if(n==0 || n==1){
            return 1;

        }
        int ans=0;
        for(int i=1;i<=n;i++){
            ans=ans+catalan(i-1)*catalan(n-i);
        }
        return ans;
    }
}
