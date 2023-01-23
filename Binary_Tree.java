import java.util.*;
public class Binary_Tree {
    private class Node{
        int data;
        Node right;
        Node left;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public Binary_Tree(){
        root=CreateTree();
    }
    private Node CreateTree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.data=item;
        boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=CreateTree();
        }
        boolean hlr=sc.nextBoolean();
        if(hlr){
            nn.right=CreateTree();
        }
        return nn;
    }
    public void Display(){
        Display(root);
    }
    private void Display(Node node){
        if(node==null){
            return;
        }
        String s="";
        s="<--"+s+node.data+"-->";
        if(node.left!=null){
            s=node.left.data+s;
        }
        else s="."+s;
        if(node.right!=null){
            s=s+node.right.data;;
        }
        else s=s+".";
        System.out.println(s);
        Display(node.left);
        Display(node.right);
    }
    public void PreOrder(){
        PreOrder(root);
    }
    private void PreOrder(Node node){
        if(node==null){
            // System.out.println();
            return;
        }
        System.out.print(node.data+" ");
        PreOrder(node.left);
        PreOrder(node.right);

    }
    public void PostOrder(){
        PostOrder(root);
    }
    private void PostOrder(Node node){
        if(node==null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data+" ");
        

    }
    public void InOrder(){
        InOrder(root);
    }
    private void InOrder(Node node){
        if(node==null){
            // System.out.println();
            return;
        }
        InOrder(node.left);
        System.out.print(node.data+" ");
        InOrder(node.right);
        
    }
    public boolean Search(int item){
        return Search(root,item);
    }
    private boolean Search(Node node,int item){
        if(node==null){
            return false;
        }
        if(node.data==item){
            return true;
        }
        boolean left=Search(node.left,item);
        boolean right=Search(node.right,item);
        return left||right;
    }
    public int Max(){
        return Max(root);
    }
    private int Max(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int left=Max(node.left);
        int right=Max(node.right);
        return Math.max(left,Math.max(right,node.data));
    }
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node==null){
            return -1;
        }
        int left=height(node.left);
        int right=height(node.right);
        return Math.max(left,right)+1;
    }
}
