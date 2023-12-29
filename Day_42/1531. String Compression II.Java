class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        char[] ch=s.toCharArray();
        int[][] dp=new int[ch.length+1][k+1];
        return depthFirst(0, k, ch, dp);
    }
    public int depthFirst(int i, int k, char[] s, int[][] dp){
        if(k<0){
            return Integer.MAX_VALUE/2;
        }
        if(s.length<=i+k){
            return 0;
        }
        if(dp[i][k]>0){
            return dp[i][k];
        }
        int r=depthFirst(i+1,k-1,s, dp);

        int c=0, d=0, next=i;
        while(next+1!=s.length && s[next+1]==s[i]){
            c++;
            next++;
        }

         while(next != s.length && k-d>=0) {
            if(s[next]!=s[i]){
                d++;
            }
            else {
                c++;
            }
            r = Math.min(r,size(c) + depthFirst(next+1,k-d, s, dp));
            next++;
        }
        dp[i][k] = r;
        return r;
    }
    public int size(int seq) {
            if(seq==0) return 0;
            else if(seq == 1) return 1;
            else if(seq < 10) return 2;
            else if(seq<100) return 3;
            else return 4;
    }
}