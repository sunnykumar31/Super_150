public class PrimeBysqrt {
    public static void main(String[] args) {
        int n=100;
        for(int i=2;i<n;i++){
            if(Isprime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean Isprime(int n){
        int div=2;
        while(div*div<=n){
            if(n%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
    
}
