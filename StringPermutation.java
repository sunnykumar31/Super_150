public class StringPermutation {
    public static void main(String[] args) {
        String str="abc";
        permutation(str,"");
    }
    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            String ques=str.substring(0,i)+str.substring(i+1);
            permutation(ques, ans+c);
        }
    }
}
