public class fourSight {
    public static void main(String[] args) {
        int n1=11;
        int n2=18;
        System.out.println(count_val(n1,n2));
    }
    public static int count_val(int input1,int input2){
        int count=0;
        for(int i=input1;i<=input2;i++){
            int temp=i;
            if(temp%4!=0){
                int f=0;
                while(temp!=0){
                    int rem=temp%10;
                    if(rem==4){
                        f=1;
                        break;
                    }
                    temp/=10;
                }
                if(f==0){
                    count++;
                }
            }
        }
        return count;
    }
}
