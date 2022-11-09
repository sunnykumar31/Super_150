import java.util.*;
public class palindromePartion {
    public static void main(String[] args) {
        String str="nitin";
        // String ans="";
        List<String> list=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        partition(str,list,ans);
        System.out.println(ans);
    }
    public static void partition(String ques,List<String> list,List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int cut=1;cut<=ques.length();cut++){
            String s=ques.substring(0,cut);
            if(isPalindrome(s)){
                list.add(s);
                partition(ques.substring(cut),list,ans);
                list.remove(list.size()-1);
            }
        }
        
    }
    public static boolean isPalindrome(String s){
        int i=0;;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
