public class reversebyRecursion {
    public static void reverse(int n){
        if(n==0){
            System.out.println("forward");
            return;
        }
        System.out.println(n);
        reverse(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        int n=5;
        reverse(n);
    }
}
