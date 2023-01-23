import java.util.Queue;
import java.util.Scanner;

public class Create_Level_Order {
    private class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public Create_Level_Order(){
        this.root=CreateTree();
    }

    private Node CreateTree(){
        Queue<Node> q =new LinkedList<>();
        Node nn=new Node();
        int val=sc.nextInt();
        nn.val=val;
        root=nn;
        q.add(nn);
        while(!q.isEmpty()){
            Node rv=q.remove();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1){
                Node node=new Node();
                node.val=c1;
                rv.left=node;
                q.add(node);
            }
            if(c2!=-1){
                Node node=new Node();
                node.val=c1;
                rv.right=node;
                q.add(node);
            }
        }
        
    }
    public void PreOrder(){
        PreOrder(root);
    }
    private void PreOrder(Node node){
        if(node==null){
            // System.out.println();
            return;
        }
        System.out.print(node.val+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public static void main(String[] args) {
        
    }
}
