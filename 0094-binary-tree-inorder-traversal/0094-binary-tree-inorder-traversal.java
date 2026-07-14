/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
       List<Integer> a= new ArrayList<>();
        a.addAll(inorderTraversal(root.left));
        //List<Integer> a= new ArrayList<>();
        a.add(root.val);
        a.addAll(inorderTraversal(root.right));
        return a;
    }
   
}