class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        Arrays.sort(strs, Comparator.comparing(String::length));
        int len=strs[0].length();
        for(int l=0;l<len;l++){
            String tmp="";
            for(int i=0;i<strs.length;i++){
                tmp=tmp+strs[i].charAt(l);
            }
            boolean allLettersSame = areAllLettersSame(tmp);
            if(allLettersSame){
                res=res+tmp.charAt(0);
            }
            else{
                return res;
            }
        }
        return res;
    }

    private static boolean areAllLettersSame(String str) {
        // Check if the string is empty or has only one character
        if (str == null || str.length() <= 1) {
            return true;
        }

        // Compare each character with the first character
        char firstChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != firstChar) {
                return false;
            }
        }

        // All characters are the same
        return true;
    }
}