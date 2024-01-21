class Solution {
    public int minimumPushes(String word) {
        int res=0, n=word.length(), temp=1;
        while(n>0){
            if(n>=8){
                res=res+temp*8;
            }else{
                res=res+temp*n;
            }
            temp++;
            n=n-8;
        }
        return res;
    }
}