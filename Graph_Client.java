import java.net.SocketPermission;
import java.util.HashSet;

public class Graph_Client {
    public static void main(String[] args) {
        Graph gh=new Graph(7);
        gh.AddEdge(1,2,5);
        gh.AddEdge(1,4,2);
        gh.AddEdge(2,3,7);
        gh.AddEdge(3,4,8);
        gh.AddEdge(4,5,1);
        gh.AddEdge(5,6,4);
        gh.AddEdge(6, 7,2);
        gh.AddEdge(5, 7, 3);
        // gh.Display();
        // System.out.println(gh.constainsEdge(8, 7));
        // System.out.println(gh.constainsEdge(1, 2));
        // System.out.println(gh.containsVertex(5));
        // System.out.println(gh.containsVertex(9));
        // System.out.println(gh.NoOfEdge());
        // gh.removeVertex(1);
        // gh.Display();
        // gh.removeEdge(2, 3);
        // gh.Display();
        // System.out.println(gh.HashPath(1, 7,new HashSet<>()));
        // gh.PrintAllHashPath(1, 7,new HashSet<>(),"");
        // System.out.println(gh.BFS(1, 7));
        // gh.BFT();
        // System.out.println(gh.DFS(1, 7));
        // gh.DFT();
        // gh.ComponentAndCycle();
        // gh.Dijstra_algo();
        // System.out.println(gh.kruskalMinCost());
        // gh.BellmanFord();
        System.out.println(gh.Prims_Algo());
    }
}
