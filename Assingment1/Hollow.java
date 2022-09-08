package Assingment1;

import java.util.*;
public class Hollow{
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int start=(n/2)+1;
		int space=-1;
		for(int i=1;i<=n;i++){
			int f=i;
			for(int j=1;j<=start;j++){
				System.out.print("*	");
			}
			for(int k=space;k>=1;k--){
				System.out.print(" 	");
			}
			for(int m=1;m<=start;m++){
				if(f==1 || f==n){
					f++;
				}
				else{
					System.out.print("*	");
				}
				
			}
			if(i<=n/2){
				start--;
				space=space+2;
			}
			else{
				start++;
				space=space-2;
			}
			System.out.println();
		}
    }
}
// output
// *	*	*    *    *		  
// *	*	     *    *
// * 	              *
// * 	*		 *	  *
// * 	*	*	 *	  *