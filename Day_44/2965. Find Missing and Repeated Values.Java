import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        Set<Integer> seen = new HashSet<>();
        int[] result = new int[2];

        // Finding the repeated value
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int current = grid[i][j];

                if (seen.contains(current)) {
                    result[0] = current; // Repeated value found
                }

                seen.add(current);
            }
        }

        // Finding the missing value
        for (int i = 1; i <= n * n; i++) {
            if (!seen.contains(i)) {
                result[1] = i; // Missing value found
                break;
            }
        }

        return result;
    }
}
