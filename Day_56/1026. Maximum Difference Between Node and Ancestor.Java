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
    public int maxAncestorDiff(TreeNode root) {
        int minimumValue = root.val;
        int maximumValue = root.val;
        return findMaxDifference(root, minimumValue, maximumValue);
    }

    public int findMaxDifference(TreeNode node, int currentMin, int currentMax) {
        if (node == null) {
            return Math.abs(currentMin - currentMax);
        }

        currentMin = Math.min(currentMin, node.val);
        currentMax = Math.max(currentMax, node.val);

        int leftSubtreeResult = findMaxDifference(node.left, currentMin, currentMax);
        int rightSubtreeResult = findMaxDifference(node.right, currentMin, currentMax);

        return Math.max(leftSubtreeResult, rightSubtreeResult);
    }
}