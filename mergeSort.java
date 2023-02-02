public class mergeSort {
    public static void main(String[] args) {
        int arr[]={1,15,7,3,9,7};
        // int ans[]=merge_sort(arr,0,arr.length-1);
        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i]+" ");
        // }
        divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //1st 
    // public static int[] merge_sort(int arr[],int lo,int hi){
    //     if(lo==hi){
    //         int a[]=new int[1];
    //         a[0]=arr[lo];
    //         return a;
    //     }
    //     int mid=(lo+hi)/2;
    //     int fs[]=merge_sort(arr,lo,mid);
    //     int ss[]=merge_sort(arr,mid+1,hi);
    //     return merge_sorted_array(fs,ss);
    // }
    // public static int[] merge_sorted_array(int[] ar1, int ar2[]){
    //     int n=ar1.length;
    //     int m=ar2.length;
    //     int merge_ar[]=new int[n+m];
    //     int i=0;
    //     int j=0;
    //     int k=0;
    //     while(i<n && j<m){
    //         if(ar1[i]<ar2[j]){
    //             merge_ar[k]=ar1[i];
    //             i++;
    //             k++;
    //         }
    //         else{
    //             merge_ar[k]=ar2[j];
    //             j++;
    //             k++;
    //         }
    //     }
    //     while(i<n){
    //         merge_ar[k]=ar1[i];
    //         i++;
    //         k++;
    //     }
    //     while(j<m){
    //         merge_ar[k]=ar2[j];
    //         j++;
    //         k++;
    //     }
    //     return merge_ar;
    // }

    // 2nd
    public static void divide(int ar[],int s,int l){
        if(s>=l){
            return;
        }
        int mid=(l+s)/2;
        divide(ar,s,mid);
        divide(ar,mid+1,l);
        conquer(ar,s,mid,l);
    }
    public static void conquer(int ar[],int s,int mid,int l){
        int merge[]=new int[l-s+1];
        int idx1=s;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=l){
            if(ar[idx1]<=ar[idx2]){
                merge[x++]=ar[idx1++];
            }
            else{
                merge[x++]=ar[idx2++];
            }
        }
        while(idx1<=mid){
            merge[x++]=ar[idx1++];
        }
        while(idx2<=l){
            merge[x++]=ar[idx2++];
        }
        int j=s;
        for(int i=0;i<merge.length;i++){
            ar[j++]=merge[i];
        }
    }
}
