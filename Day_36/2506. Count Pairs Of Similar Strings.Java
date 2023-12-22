class Solution {
    public int similarPairs(String[] words) {
        int res = 0;
        String[] temp = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            temp[i] = "";  // Initialize each element as an empty string
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            words[i] = new String(chars);

            for (char ch : words[i].toCharArray()) {
                if (!temp[i].contains(ch + "")) {
                    temp[i] += ch;
                }
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (temp[i].equals(temp[j])) {
                    res++;
                }
            }
        }

        return res;
    }
}
