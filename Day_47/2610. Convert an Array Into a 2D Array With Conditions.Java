class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        while (!map.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                tmp.add(entry.getKey());
                entry.setValue(entry.getValue() - 1);

                if (entry.getValue() == 0) {
                    iterator.remove(); // Use iterator to remove the entry
                }
            }
            res.add(tmp);
        }

        return res;
    }
}
