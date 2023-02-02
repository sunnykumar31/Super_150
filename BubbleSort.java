import java.util.*;
public class BubbleSort {
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
            for(int j=0;j<ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                    ar[j]=ar[j]^ar[j+1];
                    ar[j+1]=ar[j]^ar[j+1];
                    ar[j]=ar[j]^ar[j+1];
                }
            }
        }
    }
}
