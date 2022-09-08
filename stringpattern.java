import java.util.*;
public class stringpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                System.out.print(str.substring(i,j+1)+" ");
            }
            System.out.println();
        }
    }
}
