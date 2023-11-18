import java.util.Arrays;

class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();

        // Initialize an array of strings for each column
        String[] sr = new String[m];
        Arrays.fill(sr, "");

        // Populate the columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sr[j] += strs[i].charAt(j);
            }
        }

        int c = 0;

        // Check if each column is sorted
        for (int i = 0; i < m; i++) {
            String temp = sr[i];
            char[] tempArray = temp.toCharArray();
            Arrays.sort(tempArray);
            String t1 = new String(tempArray);

            if (!temp.equals(t1)) {
                c++;
            }
        }

        return c;
    }
}
