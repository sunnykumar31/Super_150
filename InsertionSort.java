import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        Sort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    private static void Sort(int ar[]){
        for(int i=1;i<ar.length;i++){
            int cur=ar[i];
            int j=i;
            while(j>=0 && cur<ar[j-1]){
                ar[j]=ar[j-1];
                j--;
            }
            ar[j]=cur;
        }
    }
}