class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int res=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                res++;
            }
        }
        return res;
    }
}