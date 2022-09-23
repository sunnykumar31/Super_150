public class factorialbytail {
    public static int fact(int n,int i){
        if(n<2){
            return i;
        }
        // System.out.println(i*n);
        return fact(n-1,i*n);

    
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n,1));
        
    }
}
