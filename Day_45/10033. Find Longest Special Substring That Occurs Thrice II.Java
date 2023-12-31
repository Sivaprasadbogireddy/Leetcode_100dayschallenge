import java.util.ArrayList;
import java.util.List;

class Solution {
    public int maximumLength(String s) {
        int maxLength = 0;
        List<List<Integer>> characterFrequencies = new ArrayList<>(26);

        // Initialize the list of frequencies for each character
        for (int i = 0; i < 26; i++) {
            characterFrequencies.add(new ArrayList<>());
        }

        // Calculate the frequencies of each character in the input string
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            characterFrequencies.get(s.charAt(i) - 'a').add(j - i);
            i = j - 1;
        }

        // Process the frequencies and calculate the maximum length
        for (List<Integer> frequencyList : characterFrequencies) {
            if (frequencyList.isEmpty()) continue;

            frequencyList.sort(Integer::compareTo);
            int listSize = frequencyList.size();

            maxLength = Math.max(maxLength, frequencyList.get(listSize - 1) - 2);

            if (listSize > 1) {
                maxLength = Math.max(maxLength, Math.min(frequencyList.get(listSize - 1) - 1, frequencyList.get(listSize - 2)));
            }

            if (listSize > 2) {
                maxLength = Math.max(maxLength, frequencyList.get(listSize - 3));
            }
        }

        if (maxLength == 0) {
            maxLength = -1;
        }

        return maxLength;
    }
}
