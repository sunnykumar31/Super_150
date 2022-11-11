public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int ar1[]={1,4,6,9,10};
        int ar2[]={2,4,8,11,25,34,67};
        int n=ar1.length;
        int m=ar2.length;
        int merge_ar[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(ar1[i]<ar2[j]){
                merge_ar[k]=ar1[i];
                i++;
                k++;
            }
            else{
                merge_ar[k]=ar2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            merge_ar[k]=ar1[i];
            i++;
            k++;
        }
        while(j<m){
            merge_ar[k]=ar2[j];
            j++;
            k++;
        }
        for(int p=0;p<n+m;p++){
            System.out.print(merge_ar[p]+" ");
        }
    }
    
}
