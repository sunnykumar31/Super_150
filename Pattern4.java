public class Pattern4 {
    public static void main(String args[]){
        int n=5;
        int j=1;
        int star=1;
        int space=n-1;
        while(j<=5){
            int i=1;
            int k=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }      
            while(k<=star){
                System.out.print(" *");
                k++;
            }
            j++;
            space--;
            star+=2;
            System.out.println();
            // System.out.println();
        }
    }
}
