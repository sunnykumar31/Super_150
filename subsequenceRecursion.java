public class subsequenceRecursion {
    public static void sub(String str,String start,int l){
        // when pass l=0


        // if(l==str.length()){
        //     System.out.println(start);
        //     return;
            
        // }
        // sub(str,start,l+1);
        // sub(str,start+str.charAt(l),l+1);

        //when l not pass without l;


        // if(str.length()==0){
        //     System.out.println(start);
        //     return;
            
        // }
        // char ch=str.charAt(0);
        // sub(str.substring(1),start);
        // sub(str.substring(1),start+ch);


        //when l=str.length()-1;
        if(l==-1){
            System.out.println(start);
            return;
            
        }
        sub(str,start,l-1);
        sub(str,start+str.charAt(l),l-1);

    }
    

    public static void main(String[] args) {
        String str="abc";
        String start="";
        // sub(str,start,0);
        sub(str,start,str.length()-1);
    }
}
