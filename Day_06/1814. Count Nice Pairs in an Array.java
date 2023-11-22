import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countNicePairs(int[] nums) {
        int c = 0;
        int mod = 1000000007;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            int diff = num - rev(num);
            frequencyMap.put(diff, frequencyMap.getOrDefault(diff, 0) + 1);
        }

        for (int count : frequencyMap.values()) {
            c = (int) ((c + (long) count * (count - 1) / 2) % mod);
        }

        return c;
    }

    private int rev(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}
