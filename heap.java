import java.util.*;
public class heap{
    private ArrayList<Integer> data=new ArrayList<>();
    public void add(int val){
        this.data.add(val);
        UpHeapify(this.data.size()-1);
    }
    public void UpHeapify(int ci){
        int pi=(ci-1)/2;
        if(this.data.get(pi)>this.data.get(ci)){
            swap(pi,ci);
            UpHeapify(pi);
        }
    }
    public void swap(int pi,int ci){
        int ith=this.data.get(pi);
        int jth=this.data.get(ci);
        this.data.set(ci,ith);
        this.data.set(pi,jth);
    }
    public int remove(){
        int rv=this.data.get(0);
        swap(0,this.data.size()-1);
        this.data.remove(this.data.size()-1);
        DownHeapify(0);
        return rv;
    }
    public void DownHeapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci<this.data.size() && this.data.get(pi)>this.data.get(lci)){
            mini=lci;
        }
        if(rci<this.data.size() && this.data.get(mini)>this.data.get(rci)){
            mini=rci;
        }
        if(pi!=mini){
            swap(pi,mini);
            DownHeapify(mini);
        }
    }
    public int get(){
        return this.data.get(0);
    }
    public int size(){
        return this.data.size();
    }
    public void display(){
        for(int i=0;i<this.data.size();i++){
            System.out.print(this.data.get(i)+" ");
        }
        System.out.println();
    }
}