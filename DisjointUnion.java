import java.util.*;
public class DisjointUnion {
    class Node{
        int vtx;
        int rank;
        Node parent;
    }
    HashMap<Integer,Node> map=new HashMap<>();

    public void CreateSet(int v){
        Node nn=new Node();
        nn.vtx=v;
        nn.rank=0;
        nn.parent=nn;
        map.put(v,nn);
    }

    public int find(int v){
        Node nn=map.get(v);
        return find(nn).vtx;
    }
    private Node find(Node nn){
        if(nn.parent==nn){
            return nn;
        }
        return find(nn.parent);
    }
    public void Union(int v1,int v2){
        Node nn1=map.get(v1);
        Node nn2=map.get(v2);
        Node rn1=find(nn1);
        Node rn2=find(nn2);
        if(rn1.rank==rn2.rank){
            rn1.parent=rn2;
            rn1.rank=rn1.rank+1;
        }
        else if(rn1.rank>rn2.rank){
            rn1.parent=rn2;
        }
        else{
            rn2.parent=rn1;
        }
    }
}
