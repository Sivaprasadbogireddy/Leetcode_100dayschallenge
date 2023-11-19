class Solution {
    public String replaceDigits(String s) {
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                res.append(ch);
            } else {
                int n = Character.getNumericValue(ch);
                res.append((char)(res.charAt(i - 1) + n));
            }
        }
        
        return res.toString();
    }
}
