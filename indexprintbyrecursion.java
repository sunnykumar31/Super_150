public class indexprintbyrecursion {
    public static int index(int ar[],int a,int l){
        if(l<0){
            return l;
        }
        if(ar[l]==a || l==-1){
            return l;
        }
        return index(ar,a,l-1);
    }
    public static void main(String[] args) {
        int ar[]={1,3,4,6,8,4,9,4,5};
        System.out.println(index(ar,0,ar.length-1));
    }
}
