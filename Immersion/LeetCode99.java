import java.util.ArrayList;
import java.util.List;

public class LeetCode99 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // class Solution {
    // public void recoverTree(TreeNode root) {
    // List<TreeNode> list=new ArrayList<>();
    // TreeNode first=null;
    // TreeNode second=null;
    // Inorder(root,list);
    // for(int i=0;i<list.size();i++){
    // if(list.get(i).val>list.get(i+1).val){
    // first=list.get(i);
    // break;
    // }
    // }
    // for(int i=list.size()-1;i>=0;i--){
    // if(list.get(i).val<list.get(i-1).val){
    // second=list.get(i);
    // break;
    // }
    // }
    // int temp=first.val;
    // first.val=second.val;
    // second.val=temp;
    // return;

    // }
    // public void Inorder(TreeNode root,List<TreeNode> list){
    // if(root==null){
    // return;
    // }
    // Inorder(root.left,list);
    // list.add(root);
    // Inorder(root.right,list);
    // }
    // }

    // Without extra space
    class Solution {
        TreeNode prev;
        TreeNode first;
        TreeNode second;

        public void recoverTree(TreeNode root) {
            Inorder(root);
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
            return;
        }

        public TreeNode Inorder(TreeNode root) {
            if (root == null) {
                return null;
            }
            Inorder(root.left);
            if (prev != null && prev.val > root.val) {
                if (first == null)
                    first = prev;
                else
                    second = root;

            }
            prev = root;
            Inorder(root.right);

        }
    }
}
