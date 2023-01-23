public class Binary_TreeClinet {
    public static void main(String[] args) {
        Binary_Tree bt=new Binary_Tree();
        bt.Display();
        bt.PreOrder();
        System.out.println();
        bt.PostOrder();
        System.out.println();
        bt.InOrder();
        System.out.println();
        System.out.println(bt.Search(70));
        System.out.println(bt.Max());
    }
}
