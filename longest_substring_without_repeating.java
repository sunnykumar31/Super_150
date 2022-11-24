public class longest_substring_without_repeating {
    public static void main(String[] args) {
        String s="aabcbbacbb";
        System.out.println(longest_subsequence(s));
    }
    public static int longest_subsequence(String s){
        int ar[]=new int[256];
        int n=s.length();
        int ei=0;
        int si=0;
        int ans=0;
        while(ei<n){
            char c=s.charAt(ei);
            ar[c]++;
            while(ar[c]>1){
                char c1=s.charAt(si);
                ar[c1]--;
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
            
        }
        return ans;
    }
}
