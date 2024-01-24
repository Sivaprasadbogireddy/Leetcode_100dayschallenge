class Solution {
    public int maxLength(List<String> arr) {
        return backtrack(0, "", arr);
    }

    private int backtrack(int start, String current, List<String> arr) {
        if (!hasUniqueCharacters(current)) {
            return 0;
        }

        int maxLength = current.length();

        for (int i = start; i < arr.size(); i++) {
            maxLength = Math.max(maxLength, backtrack(i + 1, current + arr.get(i), arr));
        }

        return maxLength;
    }

    private static boolean hasUniqueCharacters(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }

}