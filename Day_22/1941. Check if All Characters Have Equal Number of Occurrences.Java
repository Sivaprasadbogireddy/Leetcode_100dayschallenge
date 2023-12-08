class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        List<Integer> freq = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            freq.add(entry.getValue());
        }

        Collections.sort(freq);

        // Check if all frequencies are equal
        for (int i = 1; i < freq.size(); i++) {
            if (!freq.get(i).equals(freq.get(i - 1))) {
                return false;
            }
        }

        return true;
    }
}
