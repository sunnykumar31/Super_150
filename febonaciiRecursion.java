public class febonaciiRecursion {
    public static int febo(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1=febo(n-1);
        int f2=febo(n-2);
        return f1+f2;
    }
    public static void main(String[] args) {
        int n=6;
        // febo(n);
        System.out.println(febo(n));
    }
}
