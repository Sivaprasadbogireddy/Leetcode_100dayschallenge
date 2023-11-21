import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length || j < nums2.length) {
            if (i < nums1.length && j < nums2.length) {
                int id1 = nums1[i][0];
                int id2 = nums2[j][0];

                if (id1 == id2) {
                    result.add(new int[]{id1, nums1[i][1] + nums2[j][1]});
                    i++;
                    j++;
                } else if (id1 < id2) {
                    result.add(new int[]{id1, nums1[i][1]});
                    i++;
                } else {
                    result.add(new int[]{id2, nums2[j][1]});
                    j++;
                }
            } else if (i < nums1.length) {
                result.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            } else {
                result.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
