public class backtrackingSumLessThan10 {
    public static void main(String[] args) {
        int ar[]={2,3,5,7,11};
        int target=10;
        String ans="";
        int sum=0;
        equalThan10(ar,target,ans,sum);
    }
    public static void equalThan10(int ar[],int target,String ans,int sum){
        if(target==sum){
            System.out.println(ans);
            return;
        }
        if(target<sum){
            return;
        }
        for(int i=0;i<ar.length;i++){
            equalThan10(ar, target,ans+ar[i], sum+ar[i]);
        }
    }
}
