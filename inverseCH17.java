import java.util.*;
public class inverseCH17 {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(n!=0){
			int rem=n%10;
			sum=sum+i*(int)Math.pow(10,rem-1);
			n/=10;
			i++;
		}
		System.out.println(sum);
    }
}

