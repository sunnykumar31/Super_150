public class MAXIMIZE_XOR_ARRAY {
    public static void main(String[] args) {
        Node root=new Node();
        int arr[]={3,10,5,25,2,8};
        for(int val:arr){
            insert(root,val);
        }
        int max=Integer.MIN_VALUE;
        for(int val:arr){
            max=Math.max(max,getmaxXor(root, val));
        }
        System.out.println(max);
    }
    public static class Node{
        Node zero;
        Node one;
    }
    public static void insert(Node root,int val){
        Node curr=root;
        for(int i=31;i>=0;i--){
            if((val&(1<<i))==0){
                if(curr.zero!=null){
                    curr=curr.zero;
                }
                else{
                    Node nn=new Node();
                    curr.zero=nn;
                    curr=nn;
                }
            }
            else{
                if(curr.one!=null){
                    curr=curr.one;
                }
                else{
                    Node nn=new Node();
                    curr.one=nn;
                    curr=nn;
                }
            }
        }
    }
    public static int getmaxXor(Node root,int val){
        int num=0;
        Node curr=root;
        for(int i=31;i>=0;i--){
            int bit=(val&(1<<i));
            if(bit==0){
                if(curr.one!=null){
                    num+=(1<<i);
                    curr=curr.one;
                }
                else{
                    curr=curr.zero;
                }
            }
            else{
                if(curr.zero!=null){
                    num+=(1<<i);
                    curr=curr.zero;
                }
                else{
                    curr=curr.one;
                }
            }
        }
        return num;
    }
}
