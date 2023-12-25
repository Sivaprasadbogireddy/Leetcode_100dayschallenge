class Solution {
    public int hIndex(int[] citations) {
        int res=0;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            if(citations[i]!=res){
                res=Math.max(res, Math.min(citations[i], citations.length-i));
            }
        }
        return res;
    }
}