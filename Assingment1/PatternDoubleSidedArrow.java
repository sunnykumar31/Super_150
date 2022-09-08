package Assingment1;
import java.util.*;
public class PatternDoubleSidedArrow {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int start=1;
		int space2=-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int k=start;k>=1;k--){
				System.out.print(k+" ");
			}
			for(int l=1;l<=space2;l++){
				System.out.print("  ");
			}
			for(int m=1;m<=start;m++){
				if(i==1 || i==n){
					
				}
				else{
					System.out.print(m+" ");
				}
			}
			if(i<=n/2){
				space=space-2;
				start++;
				space2=space2+2;
			}
			else{
				space=space+2;
				start--;
				space2=space2-2;
			}
			System.out.println();
		}
    }
}
// output
//         1 
//     2 1   1 2
// 3 2 1       1 2 3
//     2 1   1 2
//         1