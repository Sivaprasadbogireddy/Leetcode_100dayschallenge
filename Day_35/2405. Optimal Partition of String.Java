class Solution {
    public int partitionString(String s) {
        int res=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.add(s.charAt(i))){
                res++;
                set.clear();
                set.add(s.charAt(i));
            }
        }
        return res+1;
    }
}