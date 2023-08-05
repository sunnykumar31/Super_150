import java.util.*;
public class BusyMan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            pair arr[]=new pair[n];
            for(int i=0;i<n;i++){
                int st=sc.nextInt();
                int end=sc.nextInt();
                arr[i]=new pair(st,end);
            }
            Arrays.sort(arr,new Comparator<pair>(){
                public int compare(pair o1,pair o2){
                    return o1.end-o2.end;
                }
            });
            int activity=1;
            int end=arr[0].end;
            for(int i=1;i<n;i++){
                if(arr[i].st>=end){
                    activity++;
                    end=arr[i].st;
                }
            }
            System.out.println(activity);
        }
    }
}
class pair{
    int st,end;
    pair(int st,int end){
        this.st=st;
        this.end=end;
    }
}
