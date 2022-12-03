public class genrateParentesis {
    public static void main(String[] args) {
        int n=4;
        generate(n,"",0,0);
    }
    public static void generate(int n,String ans,int open,int close){
        if(open==n && close==n){
            System.out.println(ans);
        }
        if(close<open){
            generate(n,ans+")",open,close+1);
        }
        if(open<n){
            generate(n, ans+"(", open+1, close);
        }
    }
}
