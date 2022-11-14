public class max_k_unique_longest_subsequence {
    public static void main(String[] args) {
        String s="aabaccdefz";
        int k=8;
        System.out.println(longest_subsequence(s,k));
    }
    public static int longest_subsequence(String s,int k){
        int ar[]=new int[256];
        int n=s.length();
        int ei=0;
        int si=0;
        int unique=0;
        int ans=-1;
        while(ei<n){
            char c=s.charAt(ei);
            if(ar[c]==0){
                unique++;
            }
            ar[c]++;
            while(unique>k){
                char c1=s.charAt(si);
                if(ar[c1]==0){
                    unique--;
                }
                ar[c1]--;
                si++;
            }
            if(unique==k){
                ans=Math.max(ans,ei-si+1);
            }
            ei++;
        }
        return ans;
    }
}
