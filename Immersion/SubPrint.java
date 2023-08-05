class SubPrint{
    public static void main(String[] args) {
        String str="abc";
        int l=str.length();
        for(int i=0;i<(1<<l);i++){
            print(i,str);
        }
    }
    private static void print(int i,String str){
        int pos=0;
        while(i>0){
            if((i&1)==1){
                System.out.print(str.charAt(pos));
            }
            pos++;
            i>>=1;
        }
        System.out.println();
    }
}