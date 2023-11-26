class Solution {
    public int beautifulSubstrings(String s, int k) {
        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int vCount = 0, cCount = 0;
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                if (isVowel(ch)) {
                    vCount++;
                } else {
                    cCount++;
                }

                if (vCount == cCount && vCount * cCount % k == 0) {
                    result++;
                }
            }
        }

        return result;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
