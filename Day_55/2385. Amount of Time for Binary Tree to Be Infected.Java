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
    private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    public int amountOfTime(TreeNode root, int start) {
        convertToGraph(root);
        Deque<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
      
        queue.offer(start);
        int time = -1; 
      
        while (!queue.isEmpty()) {
            time++;
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                int currentNode = queue.pollFirst();
                visited.add(currentNode);
              
                if (adjacencyList.containsKey(currentNode)) {
                    for (int neighbor : adjacencyList.get(currentNode)) {
                        if (!visited.contains(neighbor)) {
                            queue.offer(neighbor);
                        }
                    }
                }
            }
        }
        return time;
    }

    private void convertToGraph(TreeNode root) {
        if (root == null) {
            return;
        }
      
        Deque<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.offer(root);

        while (!nodeQueue.isEmpty()) {
            int levelSize = nodeQueue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = nodeQueue.pollFirst();
                if (currentNode.left != null) {
                    adjacencyList.computeIfAbsent(currentNode.val, k -> new ArrayList<>()).add(currentNode.left.val);
                    adjacencyList.computeIfAbsent(currentNode.left.val, k -> new ArrayList<>()).add(currentNode.val);
                    nodeQueue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    adjacencyList.computeIfAbsent(currentNode.val, k -> new ArrayList<>()).add(currentNode.right.val);
                    adjacencyList.computeIfAbsent(currentNode.right.val, k -> new ArrayList<>()).add(currentNode.val);
                    nodeQueue.offer(currentNode.right);
                }
            }
        }
    }
}
