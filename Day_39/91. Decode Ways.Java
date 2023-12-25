class Solution {
    public int numDecodings(String s) {
        int length = s.length();
        Integer[] memoizationArray = new Integer[length];
        return length == 0 ? 0 : countDecodingsHelper(0, s, memoizationArray);
    }

    private int countDecodingsHelper(int position, String s, Integer[] memoizationArray) {
        int length = s.length();
        if (position == length) {
            return 1;
        }
        if (s.charAt(position) == '0') {
            return 0;
        }
        if (memoizationArray[position] != null) {
            return memoizationArray[position];
        }
        int result = countDecodingsHelper(position + 1, s, memoizationArray);
        if (position < length - 1 && (s.charAt(position) == '1' || (s.charAt(position) == '2' && s.charAt(position + 1) < '7'))) {
            result += countDecodingsHelper(position + 2, s, memoizationArray);
        }
        return memoizationArray[position] = result;
    }
}
