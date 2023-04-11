public class BST {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public BST(int [] in){
        this.root=CreateTree(in,0,in.length-1);
        
    }
    public Node CreateTree(int in[],int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        Node nn=new Node();
        nn.val=in[mid];
        nn.left=CreateTree(in,si,mid-1);
        nn.right=CreateTree(in, mid+1, ei);
        return nn;

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
        // System.out.print(node.val+" ");
        PreOrder(node.right);

    }
    public static void main(String args[]){
        
        int ar[]={10,20,30,40,50,60,70,80,90};
        BST obj=new BST(ar);
        // obj.CreateTree(ar,0,ar.length-1);
        obj.PreOrder();

    }
}
