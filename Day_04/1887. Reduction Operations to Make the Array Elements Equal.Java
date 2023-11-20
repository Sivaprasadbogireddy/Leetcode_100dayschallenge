import java.util.Arrays;

class Solution {
    public int reductionOperations(int[] nums) {
        int n = nums.length;
        
        // Count occurrences of each unique element
        int[] count = new int[50001];
        for (int num : nums) {
            count[num]++;
        }

        // Create an array of unique elements and sort it in descending order
        int[] uniqueNums = new int[n];
        int index = 0;
        for (int i = 1; i <= 50000; i++) {
            if (count[i] > 0) {
                uniqueNums[index++] = i;
            }
        }

        Arrays.sort(uniqueNums, 0, index);

        // Calculate the total number of operations
        int operations = 0;
        for (int i = index - 1; i > 0; i--) {
            operations += count[uniqueNums[i]] * (i);
        }

        return operations;
    }
}