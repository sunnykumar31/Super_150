public class Question{
    // static void fun(int n){
    //     int a=0;
    //     int b=1;
    //     if(n==1){
    //         System.out.println(a);
    //         return;
    // }
    //      if(n==2){
    //         System.out.println(b);
    //         return;
    // }
    // int i=3;
    // int c=0;
    // while(i<=n){
    //     c=a+b;
    //     a=b;
    //     b=c;
    //     i=i+1;	
    // }
    // System.out.println(c);
    // return ;
    // }
    
    public static void main(String[] args) {
        // fun(6);
        // int i=1;
        // int j=1;
        // while(i<10 && j>10){
        //     i=i+1;
        //     j=j+2;
        // }
        // System.out.println(i);
        // System.out.println(j);

        // int f=1;
        // while(f>0){
        //     f=f+1;
            
        //     if(f==5){
        //         break;
        //     }
        //     if(f==5){
        //         continue;
        //     }
        // }
        // System.out.println(f);

        int num=342243;
        int sum=0;
        int n=100000;
        int pro=1;
        while(num!=0){
            int rem=num/n;
            sum=sum+pro*rem;
            num=num%n;
            n=n/10;
            pro=pro*10;
        }
        System.out.println(sum);


    }
}