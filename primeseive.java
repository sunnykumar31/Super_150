public class primeseive {
    public static void main(String[] args) {
        int n=100;
        boolean ar[]=new boolean[n+1];
        ar[0]=true;
        ar[1]=true;
        for(int i=2;i<ar.length;i++){
            if(ar[i]==false){
                for(int j=2;i*j<=n;j++){
                    ar[i*j]=true;
                }
            }
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]==false){
                System.out.print(i+" ");
            }
        }
    }
    //O(n*log(logn))
}
