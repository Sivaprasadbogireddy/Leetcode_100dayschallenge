import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<String, Integer> memo = new HashMap<>();
    private final int mod = (int) 1e9 + 7;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        if (startRow == m || startColumn == n || startColumn == -1 || startRow == -1) {
            return 1;
        }
        if (maxMove <= 0) {
            return 0;
        }

        String key = getKey(m, n, maxMove, startRow, startColumn);

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int down = findPaths(m, n, maxMove - 1, startRow + 1, startColumn) % mod;
        int up = findPaths(m, n, maxMove - 1, startRow - 1, startColumn) % mod;
        int right = findPaths(m, n, maxMove - 1, startRow, startColumn + 1) % mod;
        int left = findPaths(m, n, maxMove - 1, startRow, startColumn - 1) % mod;

        int result = (((down + up) % mod + right) % mod + left) % mod;
        memo.put(key, result);

        return result;
    }

    private String getKey(int m, int n, int maxMove, int startRow, int startColumn) {
        return m + "-" + n + "-" + maxMove + "-" + startRow + "-" + startColumn;
    }
}
