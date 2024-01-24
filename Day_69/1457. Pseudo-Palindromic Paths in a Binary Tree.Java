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
    public int pseudoPalindromicPaths(TreeNode root) {
        int[] countPalindromes = new int[1];
        int[] frequencyMap = new int[10];
        countPseudoPalindromicPaths(root, countPalindromes, frequencyMap);
        return countPalindromes[0];
    }
    
    public void countPseudoPalindromicPaths(TreeNode root, 
    int[] countPalindromes, int[] frequencyMap){
         if(root == null){
             return;
         }
         frequencyMap[root.val]++;
         countPseudoPalindromicPaths(root.left, countPalindromes, frequencyMap);
         countPseudoPalindromicPaths(root.right, countPalindromes, frequencyMap);
         if(root.left == null && root.right == null){
             if(isPseudoPalindrom(frequencyMap)){
                countPalindromes[0]++;
            }
         }
         frequencyMap[root.val]--;
     }

     public boolean isPseudoPalindrom(int[] frequencyMap){
        int oddOccurrenceElements = 0;
         for(int index = 0; index < frequencyMap.length; index++){
            if(frequencyMap[index] != 0 && frequencyMap[index] % 2 != 0){
                oddOccurrenceElements++; 
            }
        }
        return oddOccurrenceElements <= 1;
     }
}
