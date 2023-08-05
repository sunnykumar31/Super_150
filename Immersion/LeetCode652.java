import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.swing.tree.TreeNode;

public class LeetCode652 {

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

    class Solution {
        HashMap<String,TreeNode> map=new HashMap<>();
        HashSet<TreeNode> set=new HashSet<>();
        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
            DublicateSubstree(root);
            List<TreeNode> list=new ArrayList<>(set);
            return list;
        }
        public String DublicateSubstree(TreeNode root){
            if(root==null){
                return "x";
            }
            String left=DublicateSubstree(root.left);
            String right=DublicateSubstree(root.right);
            String s=root.val+" "+left+" "+right;
            if(map.containsKey(s)){
                set.add(map.get(s));
            }
            else{
                map.put(s,root);
            }
            return s;
        }
    }
}
