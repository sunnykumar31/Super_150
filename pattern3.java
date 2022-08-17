public class pattern3 {
    public static void main(String args[]){
        int n=5;
        int j=1;
        int star=n;
        int space=0;
        while(j<=5){
            int i=1;
            int k=1;
            while(i<=space*2){
                System.out.print("  ");
                i++;
            }      
            while(k<=star){
                System.out.print(" *");
                k++;
            }
            j++;
            space++;
            star--;
            System.out.println();
            // System.out.println();
        }
    }
}
