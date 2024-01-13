class Solution {
    public int minSteps(String s, String t) {
        int[] frequencyS = new int[26]; 
        int[] frequencyT = new int[26];
        
        for (char ch : s.toCharArray()) {
            frequencyS[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            frequencyT[ch - 'a']++;
        }

        int steps = 0;

        for (int i = 0; i < 26; i++) {
            if (frequencyT[i] < frequencyS[i]) {
                steps += frequencyS[i] - frequencyT[i];
            }
        }

        return steps;
    }
}
