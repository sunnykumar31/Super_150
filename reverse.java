// import java.net.SocketPermission;
import java.util.*;
public class reverse {
    static void reversearray(int ar[]){
        int i=0;
        int j=ar.length-1;
        while(i<j){
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        reversearray(ar);
        for(int i=0;i<n;i++){
            System.out.println(ar[i]);
        }
        
    }
}