public class backtracking1 {
    public static void main(String[] args) {
        int q=2;
        int n=4;
        boolean[] board=new boolean[4];
        String ans="";
        permutatioinofqueen(board,2,0,ans);
    }
    public static void permutatioinofqueen(boolean[] board,int q,int qsf,String ans){
        if(q==qsf){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                permutatioinofqueen(board,q,qsf+1,ans+"b"+i+"q"+qsf);
                board[i]=false;
            }
        }
    }
}
