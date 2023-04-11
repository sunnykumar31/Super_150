import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.io.StringBufferInputStream;
import java.util.*;

public class Graph {
    public HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Graph(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean containsVertex(int v) {
        return map.containsKey(v);
    }

    public boolean constainsEdge(int v1, int v2) {
        if (!containsVertex(v1) || !containsVertex(v2)) {
            return false;
        }
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    }

    public int NoOfEdge() {
        int count = 0;
        for (int key : map.keySet()) {
            count = count + map.get(key).size();
        }
        return count / 2;
    }

    public void removeEdge(int v1, int v2) {
        if (constainsEdge(v1, v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }

    public void removeVertex(int v) {
        if (!containsVertex(v))
            return;
        for (int key : map.get(v).keySet()) {
            map.get(key).remove(v);
        }
        map.remove(v);
    }

    public void Display() {
        for (int key : map.keySet()) {
            System.out.println(key + "--->" + map.get(key));
        }
        // System.out.println();
    }

    public boolean HashPath(int src, int dst, HashSet<Integer> visited) {
        if (src == dst) {
            return true;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = HashPath(nbrs, dst, visited);
                if (ans) {
                    return ans;
                }
            }
        }
        return false;
    }

    public void PrintAllHashPath(int src, int dst, HashSet<Integer> visited, String ans) {
        if (src == dst) {
            System.out.println(ans + src);
            return;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                PrintAllHashPath(nbrs, dst, visited, ans + src);
                // if(ans){
                // return ans;
                // }
            }
        }
        visited.remove(src);
        // return false;
    }

    public boolean BFS(int src, int dst) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while (!q.isEmpty()) {
            // remove
            int rv = q.remove();
            // Igonore if Already visited
            if (visited.contains(rv)) {
                continue;
            }
            // Added in Visited
            visited.add(rv);
            // Self work for checking
            if (rv == dst)
                return true;
            // adding neighbours
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs))
                    q.add(nbrs);
            }
        }
        return false;
    }

    public void BFT() {
        Queue<Integer> q = new LinkedList();
        HashSet<Integer> visited = new HashSet<>();

        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            q.add(src);
            while (!q.isEmpty()) {
                // remove
                int rv = q.remove();
                // Igonore if Already visited
                if (visited.contains(rv)) {
                    continue;
                }
                // Added in Visited
                visited.add(rv);
                // Self work for checking
                System.out.print(rv + " ");
                // adding neighbours
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs))
                        q.add(nbrs);
                }
            }
        }
    }
    public void ComponentAndCycle() {
        Queue<Integer> q = new LinkedList();
        HashSet<Integer> visited = new HashSet<>();
        int countOfComp=0;
        int countOfCycle=0;
        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            q.add(src);
            countOfComp++;
            while (!q.isEmpty()) {
                // remove
                int rv = q.remove();
                // Igonore if Already visited
                if (visited.contains(rv)) {
                    countOfCycle++;
                    continue;
                }
                // Added in Visited
                visited.add(rv);
                // Self work for checking
                // System.out.print(rv + " ");
                // adding neighbours
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs))
                        q.add(nbrs);
                }
            }
        }
        System.out.println("Number of component in Graph "+ countOfComp);
        System.out.println("Number of cycle in Graph "+ countOfCycle);
    }
    public boolean DFS(int src, int dst) {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while (!st.isEmpty()) {
            // remove
            int rv = st.pop();
            // Igonore if Already visited
            if (visited.contains(rv)) {
                continue;
            }
            // Added in Visited
            visited.add(rv);
            // Self work for checking
            if (rv == dst)
                return true;
            // adding neighbours
            for (int nbrs : map.get(rv).keySet()) {
                if (!visited.contains(nbrs))
                    st.push(nbrs);
            }
        }
        return false;
    }
    public void DFT() {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            st.push(src);
            while (!st.isEmpty()) {
                // remove
                int rv =st.pop();
                // Igonore if Already visited
                if (visited.contains(rv)) {
                    continue;
                }
                // Added in Visited
                visited.add(rv);
                // Self work for checking
                System.out.print(rv + " ");
                // adding neighbours
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visited.contains(nbrs))
                        st.push(nbrs);
                }
            }
        }
    }
    class Dijstra_pairs{
        int vtx;
        String acq;
        int cost;
        public Dijstra_pairs(int vtx,String acq,int cost){
            this.vtx=vtx;
            this.acq=acq;
            this.cost=cost;
        }
        @Override
        public String toString(){
            return vtx+" vai "+acq+" @ "+cost;
            // return acq;
        }
    }
    public void Dijstra_algo(){
        PriorityQueue<Dijstra_pairs> pq=new PriorityQueue<>(new Comparator<Dijstra_pairs>() {

            @Override
            public int compare(Graph.Dijstra_pairs o1, Graph.Dijstra_pairs o2) {
                return o2.cost-o1.cost;
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method 'compare'");
            }
           
        });
        HashSet<Integer> visited=new HashSet<>();
        pq.add(new Dijstra_pairs(1,"1",0));
        while(!pq.isEmpty()){
            Dijstra_pairs rv=pq.remove();
            if(visited.contains(rv.vtx)){
                continue;
            }
            visited.add(rv.vtx);
            // System.out.println(1);
            System.out.println(rv);
            for(int nbrs:map.get(rv.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost=rv.cost+map.get(rv.vtx).get(nbrs);
                    pq.add(new Dijstra_pairs(nbrs,rv.acq+nbrs, cost));
                }
            }
        }
    }
    class kruskal_pairs{
        int e1;
        int e2;
        int cost;
        kruskal_pairs(int e1,int e2,int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
        public String toString(){
            return this.e1+" - "+this.e2+" @ "+this.cost;
        }
    } 
    public int kruskalMinCost(){
        ArrayList<kruskal_pairs> list=new ArrayList<>();
        for(int e1:map.keySet()){
            for(int e2:map.get(e1).keySet()){
                list.add(new kruskal_pairs(e1,e2,map.get(e1).get(e2)));
            }
        }
        Collections.sort(list,new Comparator<kruskal_pairs>() {
            public int compare(kruskal_pairs o1,kruskal_pairs o2 ){
                return o1.cost-o2.cost;
            }
        });

        DisjointUnion ds=new DisjointUnion();
        for(int key:map.keySet()){
            ds.CreateSet(key);
        }
        int cost=0;
        for(kruskal_pairs e:list){
            int e1=e.e1;
            int e2=e.e2;
            int re1=ds.find(e1);
            int re2=ds.find(e2);
            if(re1==re2){
                //nothing;
            }
            else{
                System.out.println(e);
                cost+=e.cost;
                ds.Union(re1,re2);
            }
        }
        return cost;
    }
    class Bellman_pairs{
        int e1;
        int e2;
        int cost;
        Bellman_pairs(int e1,int e2,int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
        public String toString(){
            return this.e1+" - "+this.e2+" @ "+this.cost;
        }
    } 
    public void BellmanFord() {
        int n=map.size()+1;
        List<Bellman_pairs> list=new ArrayList<>();
        for(int e1:map.keySet()){
            for(int e2:map.get(e1).keySet()){
                list.add(new Bellman_pairs(e1, e2,map.get(e1).get(e2)));
            }
        }
        int relax[]=new int[n];
        for(int i=2;i<n;i++){
            relax[i]=1000000;
        }
        for(int i=0;i<n;i++){
            for(Bellman_pairs pair:list){
                // System.out.println(pair);
                int e1=pair.e1;
                int e2=pair.e2;
                int oldcost=relax[e2];
                int newcost=relax[e1]+pair.cost;
                // System.out.println(oldcost+" "+newcost);
                if(oldcost>newcost){
                    relax[e2]=newcost;
                    if(i==map.size()-1){
                        System.out.println("Contains negative Cycle");
                    }
                }
            }
                
        }
        for(int i=1;i<relax.length;i++){
            System.out.println(1+" to " +i+" @ "+relax[i]);
        }
    }
    class Prims_pairs{
        int vtx;
        int acq;
        int cost;
        Prims_pairs(int e1,int e2,int cost){
            this.vtx=e1;
            this.acq=e2;
            this.cost=cost;
        }
        public String toString(){
            return this.vtx+" - "+this.acq+" @ "+this.cost;
        }
    }
    public int Prims_Algo(){
        PriorityQueue<Prims_pairs> pq=new PriorityQueue<>(new Comparator<Prims_pairs>() {
            @Override
            public int compare(Prims_pairs o1,Prims_pairs o2){
                return o1.cost-o2.cost;
            }
        });
        HashSet<Integer> visited=new HashSet<>();
        pq.add(new Prims_pairs(1, 1, 0));
        int sum=0;
        while(!pq.isEmpty()){
            Prims_pairs rv=pq.remove();
            if(visited.contains(rv.vtx)){
                continue;
            }
            System.out.println(rv);
            sum+=rv.cost;
            visited.add(rv.vtx);
            for(int nbrs:map.get(rv.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    pq.add(new Prims_pairs(nbrs, rv.acq,map.get(rv.vtx).get(nbrs)));
                }
            }
        }
        return sum;
    } 
}
