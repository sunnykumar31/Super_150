public class febonacii {
	public static void main(String args[]) {
		int n=6;
		int a=0;
		int b=1;
		int c=0;
		if(n==1) {
			System.out.println(0);
		}
		else if(n==2) {
			System.out.println(1);
		}
		else {
			a=0;
			b=1;
			n=n-2;
			while(n!=0) {
				c=a+b;			
				a=b;
				b=c;
				n--;
			}
			System.out.println(c);
		}
	}
}
