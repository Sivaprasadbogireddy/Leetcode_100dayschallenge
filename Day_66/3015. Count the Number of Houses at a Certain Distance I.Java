class Solution {
    public int[] countOfPairs(int n, int x, int y) {
        int[] res = new int[n];
        for (int house1 = 1; house1 <= n; house1++) {
            for (int house2 = 1; house2 <= n; house2++) {
                if (house1 == house2) continue;

                int distance = Math.min(Math.abs(house1 - house2), Math.min(Math.abs(house1 - x) + Math.abs(house2 - y) + 1, Math.abs(house1 - y) + Math.abs(house2 - x) + 1));
                res[distance - 1]++;
            }
        }

        return res;
    }
}
