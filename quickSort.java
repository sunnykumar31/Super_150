public class quickSort {
    public static void main(String[] args) {
        int ar[]={9,7,2,3,1,4};
        sort(ar,0,ar.length-1);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void sort(int ar[],int si,int ei){
        if(si>ei){
            return;
        }
        int pi=prtn(ar,si,ei);
        sort(ar,si,pi-1);
        sort(ar,pi+1,ei);
    }
    public static int prtn(int[] ar,int si,int ei){
        int item=ar[ei];
        int pi=si;
        for(int i=si;i<ei;i++){
            if(ar[i]<item){
                int temp=ar[i];
                ar[i]=ar[pi];
                ar[pi]=temp;
                pi++;
            }
        }
        int cemp=ar[pi];
        ar[pi]=ar[ei];
        ar[ei]=cemp;

        return pi;
    }
}
