public class power {
    public static int pow(int a,int b,int r){
        if(b==0){
            return r;
        }
        return pow(a,b-1,r*a);
    }
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.println(pow(a,b,1));
    }
}
