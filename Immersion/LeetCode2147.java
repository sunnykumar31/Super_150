public class LeetCode2147 {
    public static void main(String[] args) {
        String str="PPSPSPPSPSPSSSS";
        System.out.println(NoCorridor(str));
    }
    public static int NoCorridor(String str){
        int totSeats=0;
        int seat=0;
        int plant=0;
        long ans=1;
        boolean firstCorridor=false;
        int mod=(int)((1e9)+7);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='S'){
                totSeats++;
                seat++;
            }
            else if(seat==0){
                plant++;
            }
            if(seat==2){
                if(firstCorridor){
                    ans=ans*(plant+1);
                    ans%=mod;
                }
                firstCorridor=true;
                seat=0;
                plant=0;
            }
        }
        if(totSeats==0 || (totSeats&1)!=0) return 0;
        return (int)ans;
    }
}
