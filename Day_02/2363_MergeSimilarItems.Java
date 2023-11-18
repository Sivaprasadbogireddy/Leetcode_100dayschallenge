import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int[] item : items1) {
            hm.put(item[0], hm.getOrDefault(item[0], 0) + item[1]);
        }

        for (int[] item : items2) {
            hm.put(item[0], hm.getOrDefault(item[0], 0) + item[1]);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }

        result.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

        return result;
    }
}
