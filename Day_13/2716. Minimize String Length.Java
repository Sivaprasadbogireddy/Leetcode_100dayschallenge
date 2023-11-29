class Solution {
    public int minimizedStringLength(String s) {
        Set set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        return set.size();
    }

}