public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int ar1[]={1,3};
        int ar2[]={2};
        if(ar1.length<ar2.length){
            System.out.println(FindMedian(ar1,ar2));
        }
        else{
            System.out.println(FindMedian(ar2,ar1));
        }
    }
    public static double FindMedian(int ar1[],int ar2[]){
        int lo=0;
        int hi=ar1.length;
        int n=ar1.length;
        int m=ar2.length;
        while(lo<=hi){
            int cut1=(lo+hi)/2;
            int cut2=(n+m+1)/2-cut1;
            int l1=cut1==0 ? Integer.MIN_VALUE:ar1[cut1-1];
            int r1=cut1==n ? Integer.MAX_VALUE:ar1[cut1];
            int l2=cut2==0 ? Integer.MIN_VALUE:ar2[cut2-1];
            int r2=cut2==m ? Integer.MAX_VALUE:ar2[cut2];
            if(l1<=r2 && l2<=r1){
                if((n+m)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
                else{
                    return Math.max(l1,l2);
                }
            }
            else if(l1>r2){
                hi=cut1-1;
            }
            else{
                lo=cut1+1;
            }   
        }
        return 0;
    }
}
