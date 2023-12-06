class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> distinctSet = new HashSet<>();

        for (String str : arr) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
                distinctSet.add(str);
            } else {
                map.put(str, map.get(str) + 1);
                distinctSet.remove(str);
            }
        }

        int count = 1;
        for (String i : arr) {
            if (map.get(i) == 1 && count == k) {
                return i;
            }
            if (map.get(i) == 1) {
                count++;
            }
        }

        return "";
    }
}
