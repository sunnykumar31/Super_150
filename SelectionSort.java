import java.util.*;
public class SelectionSort {
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
        for(int i=0;i<ar.length-1;i++){
            int small=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[small]){
                    small=j;
                }
            }
            int temp=ar[small];
            ar[small]=ar[i];
            ar[i]=temp;
        }
    }
}