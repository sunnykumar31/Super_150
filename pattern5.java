import java.util.*;
public class pattern5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=1;
        int star=1;
        int space=n-1;
        while(j<=n){
            int i=1;
            int k=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }      
            while(k<=star){
                System.out.print(" *  ");
                k++;
            }
            j++;
            
            if(j<=(n/2)+1){
                space--;
                star++;
            }
            else{
                space++;
                star--;
            }
            System.out.println();
            // System.out.println();
        }
    }
}
// output
// 5
//          *  
//        *   *  
//      *   *   *  
//    *   *   *   *  
//  *   *   *   *   *