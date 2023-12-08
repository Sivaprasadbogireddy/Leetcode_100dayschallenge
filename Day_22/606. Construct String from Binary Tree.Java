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
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        traverse(root, result);

        return result.toString();
    }

    private void traverse(TreeNode node, StringBuilder result) {
        result.append(node.val);

        if (node.left != null) {
            result.append("(");
            traverse(node.left, result);
            result.append(")");
        } else if (node.right != null) {
            result.append("()");
        }

        if (node.right != null) {
            result.append("(");
            traverse(node.right, result);
            result.append(")");
        }
    }
}
