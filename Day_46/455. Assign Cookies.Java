class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res=0;
        if (g.length == 0 || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0, j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                res++;
                i++;
            }
            j++;
        }
        return res;
    }
}