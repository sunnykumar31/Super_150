import java.util.*;
public class MST_ZERO_ONE {
    // HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
    // public MST_ZERO_ONE(int v){
    //     for(int i=1;i<=v;i++){
    //         map.put(i,new ArrayList<>());
    //     }
    // }
    // public void AddEdge(int v1,int v2){
    //     map.get(v1).add(v2);
    //     map.get(v2).add(v1);
    // }
    // class Prims_pairs{
    //     int vtx;
    //     int acq;
    //     int cost;
    //     Prims_pairs(int e1,int e2,int cost){
    //         this.vtx=e1;
    //         this.acq=e2;
    //         this.cost=cost;
    //     }
    //     public String toString(){
    //         return this.vtx+" - "+this.acq+" @ "+this.cost;
    //     }
    // }
    // public int Prims_Algo(){
    //     PriorityQueue<Prims_pairs> pq=new PriorityQueue<>(new Comparator<Prims_pairs>() {
    //         @Override
    //         public int compare(Prims_pairs o1,Prims_pairs o2){
    //             return o1.cost-o2.cost;
    //         }
    //     });
    //     HashSet<Integer> visited=new HashSet<>();
    //     pq.add(new Prims_pairs(1, 1, 0));
    //     int sum=0;
    //     while(!pq.isEmpty()){
    //         Prims_pairs rv=pq.remove();
    //         if(visited.contains(rv.vtx)){
    //             continue;
    //         }
    //         // System.out.println(rv);
    //         sum+=rv.cost;
    //         visited.add(rv.vtx);
    //         for(int nbrs=1;nbrs<map.size();nbrs++){
    //             int cost=0;
    //             if(map.get(rv.vtx).contains(nbrs)){
    //                 cost=1;
    //             }
    //             if(!visited.contains(nbrs)){
    //                 pq.add(new Prims_pairs(nbrs, rv.acq,0));
    //             }
    //         }
    //     }
    //     return sum;
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MST_ZERO_ONE obj=new MST_ZERO_ONE(sc.nextInt());
        int edge=sc.nextInt();
        for(int i=0;i<edge;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            obj.AddEdge(v1-1,v2-1);
        }
        // System.out.println(obj.Prims_Algo());
        System.out.println(obj.algo());
    }

    static TreeSet<Integer> arr[];
    static TreeSet<Integer> visited;
    public MST_ZERO_ONE(int n){
        arr=new TreeSet[n];
        for(int i=0;i<n;i++){
            arr[i]=new TreeSet<>();
        }
    }
    public void AddEdge(int v1,int v2){
        arr[v1].add(v2);
        arr[v2].add(v1);
    }
    public int algo(){
        int ans=0;
        visited=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            visited.add(i);
        }
        for(int i=0;i<arr.length;i++){
            if(visited.remove(i)){
                ans++;
                dfs(i);
            }
        }
        return ans-1;
    }
    public void dfs(int idx){
        ArrayList<Integer> ll=new ArrayList<>();
        for(int i:visited){
            if(!arr[idx].contains(i)){
                ll.add(i);
            }
        }
        for(int i:ll){
            visited.remove(i);
        }
        // for(int i:ll) dfs(i);
    }

}
