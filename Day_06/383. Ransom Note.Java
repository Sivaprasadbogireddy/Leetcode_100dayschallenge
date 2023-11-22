import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char ch : ransomNote.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : magazine.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            if (!map2.containsKey(ch) || map2.get(ch) < map1.get(ch)) {
                return false;
            }
        }

        return true;
    }
}
