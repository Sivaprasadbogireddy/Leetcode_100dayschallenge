class Solution {
    public int balancedStringSplit(String s) {
        int l=0, r=0,c=0;
        for(char ch : s.toCharArray()){
            if (ch == 'L') {
                l++;
            } else {
                r++;
            }

            if(l>0 && r>0 && l==r){
                c++;
                l=0;
                r=0;
            }

        }

        return c;
        
    }
}