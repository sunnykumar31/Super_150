public class maximixeXor {
    public static void main(String[] args) {
        int nums1=3;
        int nums2=5;
        System.out.println(XOR(nums1,nums2));
    }
    public static int XOR(int nums1,int nums2){
        int ans=0;
        int count=countBits(nums2);
        for(int i=31;i>=0 && count>0;i--){
            if((nums1&(1<<i))!=0){
                ans+=(1<<i);
                count--;
            }
        }
        for(int i=0;i<=31 && count>0;i++){
            if((nums1&(1<<i))==0){
                ans+=(1<<i);
                count--;
            }
        }
        return ans;
    }
    public static int countBits(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
