public class sumOfTwoArray {
    public static void main(String[] args) {
        int ar1[]={1,4,6,9,8,9,9};
        int ar2[]={9,4,8,1,5,3,6};
        int n=ar1.length;
        int m=ar2.length;
        int len=n;
        if(n<=m){
            len=m;
        }
        int far[]=new int[len+1];
        // List<Integer> list=new ArrayList<>();
        int i=n-1;
        int j=m-1;
        int k=len;
        int sum=0;
        int c=0;
        while(i>=0 && j>=0){
            sum+=ar1[i]+ar2[j]+c;
            if(sum>9){
                far[k]=sum%10;
                sum=0;
                c=1;
            }
            else{
                far[k]=sum;
                sum=0;
                c=0;
            }
            i--;
            j--;
            k--;
        }
        while(i>=0){
            sum+=ar1[i]+c;
            if(sum>9){
                far[k]=sum%10;
                sum=0;
                c=1;
            }
            else{
                far[k]=sum;
                sum=0;
                c=0;
            }
            i--;
            k--;
        }
        while(j>=0){
            sum+=ar2[j]+c;
            if(sum>9){
                far[k]=sum%10;
                sum=0;
                c=1;
            }
            else{
                far[k]=sum;
                sum=0;
                c=0;
            }
            j--;
            k--;
        }
        if(c==1){
            far[k]=1;
        }
        for(int p=0;p<len+1;p++){
            if(p==0 && far[p]==0){

            }
            else
                System.out.print(far[p]+" ");
        }
    }
}
