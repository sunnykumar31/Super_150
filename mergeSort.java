public class mergeSort {
    public static void main(String[] args) {
        int arr[]={1,15,7,3,9,7};
        int ans[]=merge_sort(arr,0,arr.length-1);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] merge_sort(int arr[],int lo,int hi){
        if(lo==hi){
            int a[]=new int[1];
            a[0]=arr[lo];
            return a;
        }
        int mid=(lo+hi)/2;
        int fs[]=merge_sort(arr,lo,mid);
        int ss[]=merge_sort(arr,mid+1,hi);
        return merge_sorted_array(fs,ss);
    }
    public static int[] merge_sorted_array(int[] ar1, int ar2[]){
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
        return merge_ar;
    }
}
