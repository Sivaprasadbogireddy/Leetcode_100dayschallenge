import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] odd = new int[nums.length / 2];
        int[] even = new int[(nums.length+1) / 2];
        int x = 0, y = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                odd[x++] = nums[i];
            } else {
                even[y++] = nums[i];
            }
        }
        x=nums.length/2-1;
        y = 0;
        Arrays.sort(even);
        Arrays.sort(odd);
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                res[i] = odd[x--];
            } else {
                res[i] = even[y++];
            }
        }
        return res;
    }
}
