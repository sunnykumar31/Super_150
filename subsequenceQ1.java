public class subsequenceQ1 {
    public static void cointoss(int n,String str){
        if(n==str.length()){
            System.out.println(str);
            return;
        }
        cointoss(n,str+"H");
        cointoss(n,str+"T");
    }
    public static void main(String[] args) {
        int n=3;
        String str="";
        cointoss(n,str);
    }
}
