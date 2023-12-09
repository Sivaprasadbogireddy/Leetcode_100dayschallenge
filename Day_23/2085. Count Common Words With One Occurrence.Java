class Solution {
    public int countWords(String[] words1, String[] words2) {
        int res = 0;

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String w1 : words1) {
            map1.put(w1, map1.getOrDefault(w1, 0) + 1);
        }

        for (String w2 : words2) {
            map2.put(w2, map2.getOrDefault(w2, 0) + 1);
        }

        Set<String> freq1 = new HashSet<>(map1.keySet());
        freq1.removeIf(word -> map1.get(word) > 1);

        Set<String> freq2 = new HashSet<>(map2.keySet());
        freq2.removeIf(word -> map2.get(word) > 1);

        freq1.retainAll(freq2);

        return freq1.size();
    }
}
