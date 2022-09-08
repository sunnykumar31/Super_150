import java.util.*;
public class linearsearch {
    static int lsearch(int ar[],int val){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==val){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        System.out.println(lsearch(ar,val));
    }
}
