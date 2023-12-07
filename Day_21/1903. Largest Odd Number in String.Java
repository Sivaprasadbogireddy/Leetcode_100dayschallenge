class Solution {
    public String largestOddNumber(String num) {
        String res = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            int tmp = Character.getNumericValue(num.charAt(i));
            if (Character.isDigit(num.charAt(i)) == false) {
                return res;
            }
            if (tmp % 2 != 0) {
                res = num.substring(0, i + 1);
                break;
            }
        }
        return res;
    }
}
