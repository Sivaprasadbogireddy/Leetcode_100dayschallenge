import java.util.Arrays;

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans = 0;
        int n = garbage.length;
        boolean metal = false, plastic = false, glass = false;

        for (int i = n - 1; i >= 0; i--) {
            if (!glass && garbage[i].contains("G")) {
                glass = true;
                ans += Arrays.stream(travel, 0, i).sum();
            }
            if (!metal && garbage[i].contains("M")) {
                metal = true;
                ans += Arrays.stream(travel, 0, i).sum();
            }
            if (!plastic && garbage[i].contains("P")) {
                plastic = true;
                ans += Arrays.stream(travel, 0, i).sum();
            }
            if (metal && plastic && glass) {
                break;
            }
        }

        return Arrays.stream(garbage).mapToInt(String::length).sum() + ans;
    }
}