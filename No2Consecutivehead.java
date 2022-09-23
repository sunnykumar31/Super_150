public class No2Consecutivehead {
    public static void no2head(int n,String str){
        if(str.length()==n){
            System.out.println(str);
            return;
        }
        if(str.length()==0 || str.charAt(str.length()-1)!='H'){
            no2head(n,str+"H");
        }
        no2head(n,str+"T");
    }
    public static void main(String[] args) {
        int n=3;
        String str="";
        no2head(n,str);
    }
}
