import java.util.*;
public class primeseive {
    public static void main(String[] args) {
        int n=1001;
        boolean ar[]=new boolean[n+1];
        ar[0]=true;
        ar[1]=true;
        for(int i=2;i<ar.length;i++){
            if(ar[i]==false){
                for(int j=2;i*j<=n;j++){
                    ar[i*j]=true;
                }
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            if(ar[i]==false){
                list.add(i);
                System.out.print(i+" ");
            }
        }
        int nums[]={4,9,6,10};
        int pre=0;
        for(int i=0;i<nums.length;i++){
            int post=nums[i];
            int idx=-1;
            for(int j=0;j<list.size();j++){
                if(post>=list.get(j)){
                    idx=j;
                }
                else{
                    break;
                }
            }
            // System.out.println(list.get(idx));
            int f=1;
            if(pre>=post) break;
            while(f==1){
                // if(pre>=post) break;
                if(idx==-1){
                    break;
                }
                // post=post-list.get(idx);
                // System.out.println(post+" "+i);
                if(pre<(post-list.get(idx))){
                    post=post-list.get(idx);
                    f=0;
                }
                else{
                    idx--;
                }
            }
            nums[i]=post;
            pre=post;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    //O(n*log(logn))
}
