public class permutationWithDublicate {
    public static void permutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char c=ques.charAt(i);
            boolean f=false;
            for(int j=i+1;j<ques.length();j++){
                if(ques.charAt(j)==c){
                    f=true;
                    break;
                }
            }
            if(f==false){
                String s1=ques.substring(0,i);
                String s2=ques.substring(i+1);
                permutation(s1+s2,ans+c);
            }
            
        }
        
    }
    public static void main(String[] args) {
        String str="abca";
        String ans="";
        permutation(str,ans);
    }
}
