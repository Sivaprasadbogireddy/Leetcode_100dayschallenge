class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] reqcount=new int[26];
        //Get the Total Letters Count needed
        for(char ch:chars.toCharArray()){
            reqcount[ch-'a']=reqcount[ch-'a']+1;
        }
        int res=0;
        for(String s:words){
            int[] countneeded=reqcount.clone();
            for(char ch:s.toCharArray()){
                if(--countneeded[ch-'a']<0){
                    res=res-s.length();
                    break;
                }
            }
            res=res+s.length();
        }
        return res;
    }
}