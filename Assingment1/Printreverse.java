package Assingment1;
import java.util.*;
public class  Printreverse{
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int c=0;
		int mul=1;
		int copy=n;
		while(copy!=0){
			int rem=copy%10;
			c++;
			copy/=10;
			
		}
		while(c!=0){
			int rem=n%10;
			rev=rev+rem*(int)Math.pow(10,c-1);
			n/=10;
			c--;
		}
		System.out.println(rev);
    }
}
// ip/output
// 123456789
// 987654321
