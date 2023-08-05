public class LeetCode2040 {
    public static void main(String[] args) {
        int ar1[]={-4,-2,0,3};
        int ar2[]={2,4};
        long k=6;
        System.out.println(KthProduct(ar1,ar2,k));
    }
    public static  long KthProduct(int ar1[],int ar2[],long k){
        long si=-1000_000_0000l;
        long ei=1000_000_0000l;
        long ans=0;
        while(si<=ei){
            long mid=si+(ei-si)/2;
            if(countofproduct(ar1,ar2,mid)>=k){
                ans=mid;
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
    public static long countofproduct(int ar1[],int ar2[],long product){
        long ans=0;
        for(int e1:ar1){
            if(e1>=0){
                long count=0;
                int lo=0;
                int hi=ar2.length-1;
                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long)(e1)*ar2[mid]<=product){
                        count=mid+1;
                        lo=mid+1;
                    }
                    else{
                        hi=mid-1;
                    }
                }
                ans+=count;
            }
            else{
                long count=0;
                int lo=0;
                int hi=ar2.length-1;
                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long)(e1)*ar2[mid]<=product){
                        count=ar2.length-mid;
                        hi=mid-1;
                    }
                    else{
                        lo=mid+1;
                    }
                }
                ans+=count;
            }
        }
        return ans;
    } 
}
