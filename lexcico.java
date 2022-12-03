public class lexcico {
    public static void main(String[] args) {
        int n=10;
        lexcico(0,n);
    }
    public static void lexcico(int cur,int n){
        if(cur>n){
            return;
        }
        System.out.println(cur);
        int i=0;
        if(cur==0){
            i=1;
        }
        for(;i<=9;i++){
            lexcico(cur*10+i, n);
        }
    }
}
