class Solution {
    public boolean makeEqual(String[] words) {
        int[] charFrequencies = new int[26];
        int numberOfWords = words.length;
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                charFrequencies[word.charAt(j) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (charFrequencies[i] != 0 && charFrequencies[i] % numberOfWords != 0) {
                return false;
            }
        }

        return true;
    }
}
