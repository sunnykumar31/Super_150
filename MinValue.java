import java.util.*;
public class MinValue {
    static int min(int ar[]){
        int index=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<ar[index]){
                index=i;
                
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println(min(ar));
    }
}

