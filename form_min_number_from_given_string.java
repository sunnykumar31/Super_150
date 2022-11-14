// public class form_min_number_from_given_string {
//     public static void main(String[] args) {
//         String s="DDIIDDDI";
//         int n=s.length();
//         int ar[]=new int[n+1];
//         minimum_number(s,ar);
//         for(int i=0;i<n+1;i++){
//             System.out.print(ar[i]);
//         }
//     }
//     public static void minimum_number(String s,int ar[]){
//         int n=s.length();
//         int count=1;
//         // int ar[]=new int[n+1];
//         for(int i=0;i<n+1;i++){
//             if(i==n || s.charAt(i)=='I'){
//                 ar[i]=count;
//                 count++;
//                 for(int j=i-1;j>=0 && s.charAt(j)!='I';j--){
//                     ar[j]=count;
//                     count++;
//                 }
//             }
//         }
//         return;
//     }
    
// }

public class form_min_number_from_given_string {
    public static void main(String[] args) {
        String s="DDIIDDDI";
        int n=s.length();
        // int ar[]=new int[n+1];
        // minimum_number(s);
        int ar[]=minimum_number(s);
        for(int i=0;i<n+1;i++){
            System.out.print(ar[i]);
        }
    }
    public static int[] minimum_number(String s){
        int n=s.length();
        int count=1;
        int ar[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            if(i==n || s.charAt(i)=='I'){
                ar[i]=count;
                count++;
                for(int j=i-1;j>=0 && s.charAt(j)!='I';j--){
                    ar[j]=count;
                    count++;
                }
            }
        }
        return ar;
    }
    
}

