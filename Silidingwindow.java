public class Silidingwindow {
    public static int window(int ar[],int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=ar[i];
        }
        int max=sum;
        for(int i=k;i<ar.length;i++){
            sum+=ar[i];
            sum-=ar[i-k];
            max=Math.max(sum,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,6,7,7,9,20,47,-47};
        int k=3;
        System.out.println(window(ar,k));
    }
}
